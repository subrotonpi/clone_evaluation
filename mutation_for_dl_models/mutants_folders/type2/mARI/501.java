public void copyFolder (File src, File dest) throws IOException {

    try (Stream < Path > stream = Files.walk (src.toPath ())) {

        stream.forEachOrdered (sourcePath -> {

            try {

                Files.copy (sourcePath, X1.toPath ().resolve (dest.toPath ().relativize (sourcePath)));

            } catch (Exception e) {

                e.printStackTrace ();

            }

        });

    }

}
