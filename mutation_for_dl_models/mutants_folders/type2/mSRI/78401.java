public static void main (String [] args) {

    Scanner scan = new Scanner (System.in);

    int numOfItems = 20, maxItems = 0;

    String X1 [] = new String [numOfItems];

    String Temp = "";

    for (int i = 0;

    i < X1.length; i ++) {

        System.out.print ("Enter Item " + (i + 1) + " : ");

        Temp = scan.nextLine ();

        if (Temp.equals (X1 [0])) {

            maxItems = i;

            break;

        } else {

            X1 [i] = Temp;

        }

    }

    for (int i = 0;

    i < maxItems; i ++) {

        System.out.print ("Item # " + (i + 1) + " : ");

        System.out.print (X1 [i] + "\n");

    }

}
