public void copyFolder (File X1, File dest) throws IOException {

    try (Stream < Path > stream = Files.walk (X1.toPath ())) {

        stream.forEachOrdered (sourcePath -> {

            try {

                Files.copy (sourcePath, X1.toPath ().resolve (dest.toPath ().relativize (sourcePath)));

            } catch (Exception e) {

                e.printStackTrace ();

            }

        });

    }

}
