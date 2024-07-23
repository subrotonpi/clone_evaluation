public static void unzip (File zipFile, File targetDirectory) throws IOException {

    ZipInputStream zis = new ZipInputStream (new BufferedInputStream (new FileInputStream (zipFile)));

    try {

        ZipEntry ze;

        int count;

        byte [] buffer = new byte [8192];

        while ((ze = zis.getNextEntry ()) != null) {

            File file = new File (targetDirectory, ze.getName ());

            File dir = ze.isDirectory () ? file : file.getParentFile ();

            if (! dir.isDirectory () && ! dir.mkdirs ()) throw new FileNotFoundException ("Failed to ensure directory: " + dir.getAbsolutePath ());

            if (ze.isDirectory ()) continue;

            FileOutputStream X1 = new FileOutputStream (file);

            try {

                while ((count = zis.read (buffer)) != - 1) X1.write (buffer, 0, count);

            } finally {

                X1.close ();

            }

        }

    } finally {

        zis.close ();

    }

}
