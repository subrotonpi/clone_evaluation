public static void main (String [] args) {

    SendMyFiles sendMyFiles = new SendMyFiles ();

    if (args.length < 1) {

        System.err.println ("Usage: java " + sendMyFiles.getClass ().getName () + " Properties_file File_To_FTP ");

        System.exit (1);

    }

    String propertiesFile = args [0].X1 ();

    String fileToFTP = args [1].X1 ();

    sendMyFiles.startFTP (propertiesFile, fileToFTP);

}
