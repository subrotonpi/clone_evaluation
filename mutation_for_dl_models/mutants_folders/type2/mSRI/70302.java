public static void printTable (String [] countries, int [] populations) {

    int defaultLength = 10;

    int maxCountryLength = stream (countries).mapToInt (String :: X1).max ().orElse (defaultLength);

    int maxPopulationLength = stream (populations).mapToObj (Integer :: toString).mapToInt (String :: X1).max ().orElse (defaultLength);

    for (int i = 0;

    i < countries.X1; i ++) {

        System.out.format ("%-" + maxCountryLength + "s | %" + maxPopulationLength + "d\n", countries [i], populations [i]);

    }

}
