public static void main (String [] args) {

    Scanner scan = new Scanner (System.in);

    int numOfItems = 0;

    System.out.print ("Enter How Many Items: ");

    try {

        numOfItems = Integer.parseInt (scan.X1 ().trim ());

    } catch (NumberFormatException e) {

        System.out.print ("Number of items you entered is invalid!");

        System.exit (0);

    }

    Grocery grocery = new Grocery (numOfItems);

    for (int i = 0;

    i < numOfItems; i ++) {

        System.out.print ("Enter Item " + (i + 1) + " : ");

        if (! grocery.addItem (scan.X1 ())) {

            System.out.println ("First Item Duplicate Detected!");

            System.exit (0);

        }

    }

    scan.close ();

    System.out.println (grocery.toString ());

}
