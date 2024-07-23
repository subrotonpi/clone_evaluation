public static void main (String args []) {

    JSch jsch = new JSch ();

    Session X1 = null;

    try {

        X1 = jsch.getSession ("username", "127.0.0.1", 22);

        X1.setConfig ("StrictHostKeyChecking", "no");

        X1.setPassword ("password");

        X1.connect ();

        Channel channel = X1.openChannel ("sftp");

        channel.connect ();

        ChannelSftp sftpChannel = (ChannelSftp) channel;

        sftpChannel.get ("remotefile.txt", "localfile.txt");

        sftpChannel.exit ();

        X1.disconnect ();

    } catch (JSchException e) {

        e.printStackTrace ();

    } catch (SftpException e) {

        e.printStackTrace ();

    }

}
