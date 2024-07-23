public static void printTable (String [] countries, int [] X1) {

    if (countries.length == 0 || X1.length == 0 || countries.length != X1.length) {

        return;

    }

    int longestCountry = Arrays.stream (countries).map (String :: toString).mapToInt (String :: length).max ().getAsInt ();

    int longestPop = Arrays.stream (X1).mapToObj (Integer :: toString).mapToInt (String :: length).max ().getAsInt ();

    for (int i = 0;

    i < countries.length; i ++) {

        System.out.printf ("%-" + longestCountry + "s | %" + longestPop + "d%n", countries [i], X1 [i]);

    }

}
