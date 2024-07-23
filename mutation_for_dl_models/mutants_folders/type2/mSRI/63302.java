public static void main (String [] args) throws IOException {

    ZipOutputStream X1 = new ZipOutputStream (new FileOutputStream (new File ("big.jar")));

    X1.putNextEntry (new ZipEntry ("resource.txt"));

    X1.write ("not too much in here".getBytes ());

    X1.closeEntry ();

    X1.putNextEntry (new ZipEntry ("largeFile.out"));

    for (int i = 0;

    i < 10000000; i ++) {

        X1.write ((int) (Math.round (Math.random () * 100) + 20));

    }

    X1.closeEntry ();

    X1.close ();

}
