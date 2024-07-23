 
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

}




