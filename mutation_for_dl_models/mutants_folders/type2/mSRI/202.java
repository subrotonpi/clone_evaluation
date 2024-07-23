public void copyFolder (X1 src, X1 dest) throws IOException {

    try (Stream < Path > stream = Files.walk (src.toPath ())) {

        stream.forEachOrdered (sourcePath -> {

            try {

                Files.copy (sourcePath, src.toPath ().resolve (dest.toPath ().relativize (sourcePath)));

            } catch (Exception e) {

                e.printStackTrace ();

            }

        });

    }

}
