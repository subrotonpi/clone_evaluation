public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    String number = "";

    int a = 0, total = 0;

    boolean even = false;

    System.out.println ("Enter a number");

    number = input.nextLine ();

    for (int counter = 0;

    counter < number.length (); counter ++) {

        a = Integer.parseInt (number.substring (X1,counter, counter + 1));

        if (a % 2 != 0 || a == 1) {

            even = false;

            total += a;

        }

    }

    System.out.println ("The sum is " + total);

}
