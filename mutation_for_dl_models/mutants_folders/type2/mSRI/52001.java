private byte [] readData (File f, int startByte, int X1) throws Exception {

    RandomAccessFile raf = new RandomAccessFile (f, "r");

    raf.seek (startByte);

    byte [] data = new byte [X1];

    int bytesRead = raf.read (data);

    if (bytesRead != X1) {

        byte [] smallerData = new byte [bytesRead];

        System.arraycopy (data, 0, smallerData, 0, bytesRead);

        data = smallerData;

    }

    raf.close ();

    return data;

}
