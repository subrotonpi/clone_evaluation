public static byte [] readBytes (InputStream inputStream) throws IOException {

    byte [] X1 = new byte [32 * 1024];

    int bufferSize = 0;

    for (;;) {

        int read = inputStream.read (X1, bufferSize, X1.length - bufferSize);

        if (read == - 1) {

            return Arrays.copyOf (X1, bufferSize);

        }

        bufferSize += read;

        if (bufferSize == X1.length) {

            X1 = Arrays.copyOf (X1, bufferSize * 2);

        }

    }

}
