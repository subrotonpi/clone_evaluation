public String inputStreamToString (InputStream inputStream) throws IOException {

    try (ByteArrayOutputStream X1 = new ByteArrayOutputStream ()) {

        byte [] buffer = new byte [1024];

        int length;

        while ((length = inputStream.read (buffer)) != - 1) {

            X1.write (buffer, 0, length);

        }

        return X1.toString (UTF_8);

    }

}
