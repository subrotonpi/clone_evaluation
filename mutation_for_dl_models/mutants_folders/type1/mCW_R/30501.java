public String inputStreamToString (InputStream in) throws IOException {

    ReadableByteChannel channel = Channels.newChannel (in);

   ByteBuffer byteBuffer = ByteBuffer.allocate (1024 * 16);

    ByteArrayOutputStream bout = new ByteArrayOutputStream ();

    WritableByteChannel outChannel = Channels.newChannel (bout);

    while (channel.read (byteBuffer) > 0 || byteBuffer.position () > 0) {

        byteBuffer.flip ();

        outChannel.write (byteBuffer);

        byteBuffer.compact ();

    }

    channel.close ();

    outChannel.close ();

    return bout.toString (UTF_8);

}
