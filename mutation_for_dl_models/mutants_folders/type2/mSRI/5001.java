public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.print ("\t\tPlease enter the maximum: ");

    int max = input.nextInt ();

    System.out.print ("\t\tPlease enter the minimum: ");

    int min = input.nextInt ();

    System.out.print ("enter: ");

    input.nextLine ();

    String word = input.nextLine ();

    System.out.print (word);

    int X1 = 0;

    for (int i = 0;

    i < word.length (); i ++) {

        if (word.charAt (i) == ' ') {

            X1 ++;

        }

    }

    X1 ++;

    System.out.println (X1);

    if (X1 <= max && X1 >= min) {

        System.out.println ("YAY!!!!!!!!! YOU'RE WTHIN THE RAAAANGE!!!!!!!!!!!!!!!!!!!!!!!");

    }

}
