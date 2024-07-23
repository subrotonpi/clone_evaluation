public static void main (String args []) {

    Scanner in = new Scanner (System.in);

    System.out.print ("ArtificialStringReplacement");

    System.out.println ("the roman numeral version is: " + toRoman (in.nextInt ()));

    for (int i = 1;

    i <= 3999; i ++) {

        System.out.println (i + " === " + toRoman (i));

    }

}
