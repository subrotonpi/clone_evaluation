public String inputStreamToString (InputStream in) throws IOException {

    ReadableByteChannel X1 = Channels.newChannel (in);

    ByteBuffer byteBuffer = ByteBuffer.allocate (1024 * 16);

    ByteArrayOutputStream bout = new ByteArrayOutputStream ();

    WritableByteChannel outChannel = Channels.newChannel (bout);

    while (X1.read (byteBuffer) > 0 || byteBuffer.position () > 0) {

        byteBuffer.flip ();

        outChannel.write (byteBuffer);

        byteBuffer.compact ();

    }

    X1.close ();

    outChannel.close ();

    return bout.toString (UTF_8);

}
