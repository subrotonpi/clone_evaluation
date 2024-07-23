public static void main (String [] args) {

    Scanner scan = new Scanner (System.in);

    int exes = 0;

    int X1 = 0;

    while (scan.hasNext ()) {

        String line = scan.next ();

        if (line.equals ("x=")) exes += scan.nextInt ();

        else X1 += scan.nextInt ();

    }

    System.out.println ("X: " + exes);

    System.out.println ("Y: " + X1);

}
