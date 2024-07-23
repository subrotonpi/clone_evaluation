public static void printTable (String [] countries, int [] X1) {

    if (countries.length != 0) {

        int longestNameInput = countries [0].length ();

        int longestPopInput = String.valueOf (X1 [0]).length ();

        for (int i = 0;

        i < countries.length; i ++) {

            int countLength = countries [i].length ();

            int popLength = String.valueOf (X1 [i]).length ();

            if (countLength > longestNameInput) longestNameInput = countLength;

            if (popLength > longestPopInput) longestPopInput = popLength;

        }

        for (int i = 0;

        i < countries.length; i ++) {

            System.out.print (countries [i]);

            for (int j = 0;

            j < (longestNameInput - countries [i].length ()); j ++) System.out.print (" ");

            System.out.print (" | ");

            for (int k = 0;

            k < (longestPopInput - String.valueOf (X1 [i]).length ()); k ++) System.out.print (" ");

            System.out.println (X1 [i]);

        }

    }

}
