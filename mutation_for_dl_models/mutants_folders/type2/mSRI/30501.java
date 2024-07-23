public String inputStreamToString (InputStream in) throws IOException {

    ReadableByteChannel channel = Channels.newChannel (in);

    ByteBuffer X1 = ByteBuffer.allocate (1024 * 16);

    ByteArrayOutputStream bout = new ByteArrayOutputStream ();

    WritableByteChannel outChannel = Channels.newChannel (bout);

    while (channel.read (X1) > 0 || X1.position () > 0) {

        X1.flip ();

        outChannel.write (X1);

        X1.compact ();

    }

    channel.close ();

    outChannel.close ();

    return bout.toString (UTF_8);

}
