public static void main (String args []) {

    String inputString;

    Scanner s = new Scanner (System.in);

    inputString = s.nextLine ();

    if (! inputString.matches ("ArtificialStringReplacement")) {

        System.out.println ("Not a Number");

    } else {

        Double result2 = getNumber (inputString);

        System.out.println ("result = " + result2);

    }

}
