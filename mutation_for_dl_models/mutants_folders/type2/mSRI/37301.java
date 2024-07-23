public static void main (String [] args) {

    InputStream inStream = null;

    OutputStream outStream = null;

    try {

        File afile = new File ("C:\\folderA\\Afile.txt");

        File bfile = new File ("C:\\folderB\\Afile.txt");

        inStream = new FileInputStream (afile);

        outStream = new FileOutputStream (bfile);

        byte [] X1 = new byte [1024];

        int length;

        while ((length = inStream.read (X1)) > 0) {

            outStream.write (X1, 0, length);

        }

        inStream.close ();

        outStream.close ();

        afile.delete ();

        System.out.println ("File is copied successful!");

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
