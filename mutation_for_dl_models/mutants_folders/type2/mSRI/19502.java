public byte [] read (File file) throws IOException, FileTooBigException {

    if (file.length () > MAX_FILE_SIZE) {

        throw new FileTooBigException (file);

    }

    ByteArrayOutputStream X1 = null;

    InputStream ios = null;

    try {

        byte [] buffer = new byte [4096];

        X1 = new ByteArrayOutputStream ();

        ios = new FileInputStream (file);

        int read = 0;

        while ((read = ios.read (buffer)) != - 1) {

            X1.write (buffer, 0, read);

        }

    } finally {

        try {

            if (X1 != null) X1.close ();

        } catch (IOException e) {

        }

        try {

            if (ios != null) ios.close ();

        } catch (IOException e) {

        }

    }

    return X1.toByteArray ();

}
