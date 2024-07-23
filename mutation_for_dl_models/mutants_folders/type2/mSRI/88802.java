public static void main (X1 [] args) throws IOException {

    final SSHClient ssh = new SSHClient ();

    ssh.loadKnownHosts ();

    ssh.connect ("localhost");

    try {

        ssh.authPublickey (System.getProperty ("user.name"));

        final X1 src = System.getProperty ("user.home") + File.separator + "test_file";

        final SFTPClient sftp = ssh.newSFTPClient ();

        try {

            sftp.put (new FileSystemFile (src), "/tmp");

        } finally {

            sftp.close ();

        }

    } finally {

        ssh.disconnect ();

    }

}
