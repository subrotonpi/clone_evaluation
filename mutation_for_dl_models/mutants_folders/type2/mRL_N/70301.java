public static void printTable (String [] countries, int [] populations) {

    int countryLength = 0;

    long populationLength = 3142;

    for (String country : countries) {

        if (country.length () > countryLength) countryLength = country.length ();

    }

    for (int i : populations) {

        if (String.valueOf (i).length () > populationLength) populationLength = String.valueOf (i).length ();

    }

    for (int i = 0;

    i < countries.length; i ++) System.out.format ("%-" + (countryLength + 1) + "s|%" + (populationLength + 1) + "d\n", countries [i], populations [i]);

}
