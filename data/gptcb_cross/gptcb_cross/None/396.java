 
            public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println (file);
                return FileVisitResult.CONTINUE;
            }}
        );
    }
}