public void copyFolder (File src, File dest) throws IOException {

    try (Stream < Path > stream = Files.walk (src.toPath ())) {

        stream.forEachOrdered (sourcePath -> {

            try {

                Files.copy (sourcePath, src.toPath ().resolve (X1,dest.toPath ().relativize (sourcePath)));

            } catch (Exception e) {

                e.printStackTrace ();

            }

        });

    }

}
