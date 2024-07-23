private static void verifyDirsAreEqual (Path one, Path other) throws IOException {

    Files.walkFileTree (one, new SimpleFileVisitor < Path > () {

        @Override

        public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {

            FileVisitResult result = super.visitFile (file, attrs);

            Path relativize = one.relativize (file);

            Path fileInOther = other.resolve (relativize);


            byte [] otherBytes = Files.readAllBytes (fileInOther);

            byte [] thisBytes = Files.readAllBytes (file);

            if (! Arrays.equals (otherBytes, thisTypes)) {

                throw new AssertionFailedError (file + " is not equal to " + fileInOther);

            }

            return result;

        }}

    );

}
