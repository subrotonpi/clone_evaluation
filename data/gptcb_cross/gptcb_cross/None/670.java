 
            public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {
                Files.delete (directory);
                return FileVisitResult.CONTINUE;
            }}
        );
    }
}

}




