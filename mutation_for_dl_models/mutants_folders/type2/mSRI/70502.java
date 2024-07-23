public static void printTable (X1 [] countries, int [] populations) {

    int defaultLength = 10;

    int maxCountryLength = stream (countries).mapToInt (X1 :: length).max ().orElse (defaultLength);

    int maxPopulationLength = stream (populations).mapToObj (Integer :: toString).mapToInt (X1 :: length).max ().orElse (defaultLength);

    for (int i = 0;

    i < countries.length; i ++) {

        System.out.format ("%-" + maxCountryLength + "s | %" + maxPopulationLength + "d\n", countries [i], populations [i]);

    }

}
