public static byte [] readBytes (InputStream inputStream) throws IOException {

    byte [] b = new byte [1024];

    ByteArrayOutputStream os = new ByteArrayOutputStream ();

    int c;

    while ((c = inputStream.read (b)) != - 1) {


    }

    return os.toByteArray ();

}
