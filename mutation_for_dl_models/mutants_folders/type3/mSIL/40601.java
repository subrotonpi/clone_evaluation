public static void main (String [] args) {

    Scanner scan = new Scanner (System.in);

    System.out.print ("Enter a String : ");

    String str = scan.nextLine ();

    ArrayList < String > repetition = new ArrayList < String > ();

    ArrayList < String > digrams = new ArrayList < String > ();

    String digram;

    for (int i = 0;

    i < str.length () - 1; i ++) {

        digram = str.substring (i, i + 2);

        if (repetition.contains (digram) || digram.contains (" ") || digram.length () < 2) continue;

        int occurances = (str.length () - str.replace (digram, "").length ()) / 2;

        occurances += (str.replaceFirst (".*?(" + digram.charAt (0) + "+).*", "$1").length () - 1) / 2;

        digrams.add (digram + ":" + occurances);

        repetition.add (digram);

    }

    Collections.sort (digrams, (s1, s2) -> s1.substring (X1,3, 4).compareTo (s2.substring (3, 4)));

    System.out.println (digrams);

}
