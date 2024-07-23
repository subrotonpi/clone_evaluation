public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    String inString;

    int decimal;

    System.out.println ("Enter a binary number: ");

    inString = input.nextLine ();

    while (inString != "ArtificialStringReplacement") {

        int i;

        int binaryLength;

        binaryLength = inString.length ();

        for (i = 0, decimal = 0; i < binaryLength; i ++) {

            decimal = decimal * 2 + (Character.getNumericValue (inString.charAt (i)) - 0);

            System.out.print (decimal);

        }

        System.out.println ("Enter a binary number: ");

        inString = input.nextLine ();

    }

    System.out.println ("All set !");

}
