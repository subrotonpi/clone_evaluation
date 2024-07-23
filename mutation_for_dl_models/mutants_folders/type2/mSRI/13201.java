public static void main (String [] args) {

    System.out.println ("Enter name");

    Scanner kb = new Scanner (System.in);

    String X1 = kb.next ();

    if (null == X1 || X1.isEmpty ()) {

        System.out.println ("Text empty");

    } else if (X1.charAt (0) == (X1.toUpperCase ().charAt (0))) {

        System.out.println ("First letter in word " + X1 + " is upper case");

    }

}
