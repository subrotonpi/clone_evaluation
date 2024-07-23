public static void printTable (String [] countries, int [] populations) {

    if (countries.length != 0) {

        int longestNameInput = countries [0].length ();

        int longestPopInput = String.valueOf (populations [0]).length ();

        for (int X1 = 0;

        X1 < countries.length; X1 ++) {

            int countLength = countries [X1].length ();

            int popLength = String.valueOf (populations [X1]).length ();

            if (countLength > longestNameInput) longestNameInput = countLength;

            if (popLength > longestPopInput) longestPopInput = popLength;

        }

        for (int X1 = 0;

        X1 < countries.length; X1 ++) {

            System.out.print (countries [X1]);

            for (int j = 0;

            j < (longestNameInput - countries [X1].length ()); j ++) System.out.print (" ");

            System.out.print (" | ");

            for (int k = 0;

            k < (longestPopInput - String.valueOf (populations [X1]).length ()); k ++) System.out.print (" ");

            System.out.println (populations [X1]);

        }

    }

}
