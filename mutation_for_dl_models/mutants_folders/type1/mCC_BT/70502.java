public static void printTable (String [] countries, int [] populations) {

    int defaultLength = 10;

    /* Comment */  int maxCountryLength = stream (countries).mapToInt (String :: length).max ().orElse (defaultLength);

    int maxPopulationLength = stream (populations).mapToObj (Integer :: toString).mapToInt (String :: length).max ().orElse (defaultLength);

    for (int i = 0;

    i < countries.length; i ++) {

        System.out.format ("%-" + maxCountryLength + "s | %" + maxPopulationLength + "d\n", countries [i], populations [i]);

    }

}
