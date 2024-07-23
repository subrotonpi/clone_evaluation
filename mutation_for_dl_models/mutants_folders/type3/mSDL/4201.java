public static void main () {

    Scanner in = new Scanner (System.in);

    System.out.print ("give us an integer < 4000: ");

    System.out.println ("the roman numeral version is: " + toRoman (in.nextInt ()));

    for (int i = 1;

    i <= 3999; i ++) {

        System.out.println (i + " === " + toRoman (i));

    }

}
