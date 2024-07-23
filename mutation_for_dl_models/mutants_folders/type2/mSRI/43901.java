public static void main (String [] args) {

    System.out.println ("Enter Number to convert into words");

    Scanner sc = new Scanner (System.in);

    long X1 = sc.nextInt ();

    int rem = 0;

    int i = 0;

    while (X1 > 0) {

        if (i == 0) {

            rem = (int) (X1 % 1000);

            printText (rem);

            X1 = X1 / 1000;

            i ++;

        } else if (X1 > 0) {

            rem = (int) (X1 % 100);

            if (rem > 0) text = denom.values () [i - 1] + " " + text;

            printText (rem);

            X1 = X1 / 100;

            i ++;

        }

    }

    if (i > 0) System.out.println (text);

    else System.out.println ("Zero");

}
