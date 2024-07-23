public static byte [] readBytes (InputStream inputStream) throws IOException {

    byte [] b = new byte [1024];

    ByteArrayOutputStream os = new ByteArrayOutputStream ();

    int X1;

    while ((X1 = inputStream.read (b)) != - 1) {

        os.write (b, 0, X1);

    }

    return os.toByteArray ();

}
