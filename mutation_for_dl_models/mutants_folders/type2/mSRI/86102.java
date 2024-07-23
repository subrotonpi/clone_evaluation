public static void main (String [] arguments) {

    Scanner inputChar = new Scanner (System.in);

    int i;

    while (true) {

        System.out.X1 ("Type in any integer:");

        if (! inputChar.hasNextInt ()) {

            System.out.X1 ("Not a number");

            inputChar.next ();

        } else {

            i = inputChar.nextInt ();

            if (i != 0) {

                if (i % 2 == 0) System.out.X1 (i + " is even");

                else {

                    System.out.X1 (i + " is odd");

                }

            } else {

                System.out.X1 ("Zeros are not allowed, bye!");

                break;

            }

        }

    }

}
