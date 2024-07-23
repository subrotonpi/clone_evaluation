private byte [] readData (File f, int startByte, int chunkSize) throws Exception {

    RandomAccessFile X1 = new RandomAccessFile (f, "r");

    X1.seek (startByte);

    byte [] data = new byte [chunkSize];

    int read = X1.read (data);

    X1.close ();

    if (read == data.length) return data;

    else return Arrays.copyOf (data, read);

}
