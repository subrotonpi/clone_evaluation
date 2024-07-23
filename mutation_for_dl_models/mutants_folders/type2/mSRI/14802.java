public static void main (String [] args) {

    final Scanner input = new Scanner (System.in);

    String X1;

    while (true) {

        System.out.println ("Enter a binary number: ");

        X1 = input.nextLine ();

        if (X1.equals ("-1")) break;

        System.out.println (Integer.parseInt (X1, 2));

    }

    System.out.println ("All set !");

}
