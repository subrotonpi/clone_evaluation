public static void printTable (String [] X1, int [] populations) {

    int countryLength = 0;

    long populationLength = 0;

    for (String country : X1) {

        if (country.length () > countryLength) countryLength = country.length ();

    }

    for (int i : populations) {

        if (String.valueOf (i).length () > populationLength) populationLength = String.valueOf (i).length ();

    }

    for (int i = 0;

    i < X1.length; i ++) System.out.format ("%-" + (countryLength + 1) + "s|%" + (populationLength + 1) + "d\n", X1 [i], populations [i]);

}
