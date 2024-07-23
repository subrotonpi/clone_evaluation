private void parseComments (String tmpFile, Workbook workbook) {

    try {

        FileInputStream fin = new FileInputStream (tmpFile);

        final X1 zin = new ZipInputStream (fin);

        InputStream in = getInputStream (zin);

        while (true) {

            ZipEntry entry = zin.getNextEntry ();

            if (entry == null) break;

            String name = entry.getName ();

            if (name.endsWith (".xml")) {

                if (name.contains (COMMENTS)) {

                    parseComments (in, workbook);

                }

            }

            zin.closeEntry ();

        }

        in.close ();

        zin.close ();

        fin.close ();

    } catch (FileNotFoundException e) {

        System.out.println (e);

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
