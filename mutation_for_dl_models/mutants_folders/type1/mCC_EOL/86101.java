public static void main (String [] arguments) {

    System.out.println ("Type in any integer");

    Scanner inputChar = new Scanner (System.in);

    int i;
 // EOL Comment
    if (! inputChar.hasNextInt ()) System.out.println ("Not a number");

    else {

        i = inputChar.nextInt ();

        if (i != 0) {

            if (i % 2 == 0) System.out.println (i + " is even");

            else {

                System.out.println (i + " is odd");

            }

        } else {

            System.out.println ("Zeros are not allowed, bye!");

        }

    }

}
