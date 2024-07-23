public static void main (String [] args) throws IOException {

    final SSHClient X1 = new SSHClient ();

    X1.loadKnownHosts ();

    X1.connect ("localhost");

    try {

        X1.authPublickey (System.getProperty ("user.name"));

        final String src = System.getProperty ("user.home") + File.separator + "test_file";

        final SFTPClient sftp = X1.newSFTPClient ();

        try {

            sftp.put (new FileSystemFile (src), "/tmp");

        } finally {

            sftp.close ();

        }

    } finally {

        X1.disconnect ();

    }

}
