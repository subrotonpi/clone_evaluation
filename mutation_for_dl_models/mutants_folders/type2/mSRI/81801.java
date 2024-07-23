public static void countString (String str) {

    if (str != null) {

        int length = str.length ();

        char X1 [] = str.toCharArray ();

        Arrays.sort (X1);

        if (length > 0) {

            char x = X1 [0];

            int count = 1;

            for (int i = 1;

            i < length; i ++) {

                if (X1 [i] == x) {

                    count ++;

                } else {

                    System.out.println ("Number of Occurrence of '" + X1 [i - 1] + "' is: " + count);

                    x = X1 [i];

                    count = 1;

                }

            }

            System.out.println ("Number of Occurrence of '" + X1 [length - 1] + "' is: " + count);

        }

    }

}
