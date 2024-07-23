public String inputStreamToString (InputStream inputStream) throws IOException {

    try (ByteArrayOutputStream result = new ByteArrayOutputStream ()) { // EOL Comment

        byte [] buffer = new byte [1024];

        int length;

        while ((length = inputStream.read (buffer)) != - 1) {

            result.write (buffer, 0, length);

        }

        return result.toString (UTF_8);

    }

}
