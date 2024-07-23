public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    String X1 = "";

    int a = 0, total = 0;

    boolean even = false;

    System.out.println ("Enter a number");

    X1 = input.nextLine ();

    for (int counter = 0;

    counter < X1.length (); counter ++) {

        a = Integer.parseInt (X1.substring (counter, counter + 1));

        if (a % 2 != 0 || a == 1) {

            even = false;

            total += a;

        }

    }

    System.out.println ("The sum is " + total);

}
