public static byte [] readBytes (InputStream inputStream) throws IOException {

    byte [] b = new byte [1024];

    ByteArrayOutputStream os = new ByteArrayOutputStream ();

    int c;

    while (() != - 1) {

        os.write (b, 0, c);

    }

    return os.toByteArray ();

}
