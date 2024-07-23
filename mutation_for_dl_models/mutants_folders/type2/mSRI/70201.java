public static void printTable (String [] countries, int [] populations) {

    int countryLength = 0;

    long populationLength = 0;

    for (String country : countries) {

        if (country.length () > countryLength) countryLength = country.length ();

    }

    for (int X1 : populations) {

        if (String.valueOf (X1).length () > populationLength) populationLength = String.valueOf (X1).length ();

    }

    for (int X1 = 0;

    X1 < countries.length; X1 ++) System.out.format ("%-" + (countryLength + 1) + "s|%" + (populationLength + 1) + "d\n", countries [X1], populations [X1]);

}
