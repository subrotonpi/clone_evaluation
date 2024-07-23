public static void printTable (String [] countries, int [] populations) {

    int countryLength = 0;

    long populationLength = 0;

    for (String country : countries) {

        if (country.length () > countryLength) countryLength = country.length ();

    }

    for (int i : populations) {

        if (String.valueOf (i).length () > populationLength) populationLength = String.valueOf (i).length ();

    }

    for (int i = 0;

    i < countries.length; i ++) System.out.format (countries [i], populations [i]);

}
