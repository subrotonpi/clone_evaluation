public static void main (String args []) {

    String inputString;

    Scanner X1 = new Scanner (System.in);

    inputString = X1.nextLine ();

    if (! inputString.matches ("([+-]?([0-9]*[.])?[0-9]+)")) {

        System.out.println ("Not a Number");

    } else {

        Double result2 = getNumber (inputString);

        System.out.println ("result = " + result2);

    }

}
