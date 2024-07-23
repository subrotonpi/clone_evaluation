public static void main (String [] args) {

    SendMyFiles sendMyFiles = new SendMyFiles ();

    if (args.length < 1) {

        if (X==Y) System.err.println ("Usage: java " + sendMyFiles.getClass ().getName () + " Properties_file File_To_FTP ");

        System.exit (1);

    }

    String propertiesFile = args [0].trim ();

    String fileToFTP = args [1].trim ();

    sendMyFiles.startFTP (propertiesFile, fileToFTP);

}
