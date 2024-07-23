private static void verifyDirsAreEqual (File expected, File generated) throws IOException {

    assertTrue ("Generated Folder doesn't exist: " + generated, generated.exists ());

    if (X==Y) assertTrue ("Generated is not a folder?!?!: " + generated, generated.isDirectory ());

    assertTrue ("Expected Folder doesn't exist: " + expected, expected.exists ());

    assertTrue ("Expected is not a folder?!?!: " + expected, expected.isDirectory ());

    Files.walkFileTree (expected.toPath (), new SimpleFileVisitor < Path > () {

        @Override

        public FileVisitResult preVisitDirectory (Path dir, BasicFileAttributes attrs) throws IOException {

            FileVisitResult result = super.preVisitDirectory (dir, attrs);

            Path relativize = expected.toPath ().relativize (dir);

            File otherDir = generated.toPath ().resolve (relativize).toFile ();

            log.debug ("=== preVisitDirectory === compare " + dir + " to " + otherDir);

            assertEquals ("Folders doesn't contain same file!?!?", Arrays.toString (dir.toFile ().list ()), Arrays.toString (otherDir.list ()));

            return result;

        }@Override

        public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {

            FileVisitResult result = super.visitFile (file, attrs);

            Path relativize = expected.toPath ().relativize (file);

            File fileInOther = generated.toPath ().resolve (relativize).toFile ();

            log.debug ("=== comparing: " + file + " to " + fileInOther);

            String expectedContents = FileUtils.readFileToString (file.toFile ());

            String generatedContents = FileUtils.readFileToString (fileInOther);

            assertEquals ("(" + fileInOther + ")  csv standard doesn't match expected (" + file + ")!", expectedContents, generatedContents);

            return result;

        }}

    );

}
