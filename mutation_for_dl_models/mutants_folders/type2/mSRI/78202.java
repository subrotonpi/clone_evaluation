public static void main (String [] args) {

    Scanner scan = new Scanner (X1.in);

    int numOfItems = 20, maxItems = 0;

    String arrayOfNames [] = new String [numOfItems];

    String Temp = "";

    for (int i = 0;

    i < arrayOfNames.length; i ++) {

        X1.out.print ("Enter Item " + (i + 1) + " : ");

        Temp = scan.nextLine ();

        if (Temp.equals (arrayOfNames [0])) {

            maxItems = i;

            break;

        } else {

            arrayOfNames [i] = Temp;

        }

    }

    for (int i = 0;

    i < maxItems; i ++) {

        X1.out.print ("Item # " + (i + 1) + " : ");

        X1.out.print (arrayOfNames [i] + "\n");

    }

}
