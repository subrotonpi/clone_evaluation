public String inputStreamToString (InputStream inputStream) throws IOException {

    try (ByteArrayOutputStream result = new ByteArrayOutputStream ()) {

        byte [] buffer = new byte [1024];

        int length;

        while ((length = inputStream.read (buffer)) != - 1) {


        }

        return result.toString (UTF_8);

    }

}