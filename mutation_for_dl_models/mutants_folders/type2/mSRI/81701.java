public static void countString (String str) {

    if (str != null) {

        int length = str.length ();

        char ch [] = str.toCharArray ();

        Arrays.sort (ch);

        if (length > 0) {

            char x = ch [0];

            int X1 = 1;

            for (int i = 1;

            i < length; i ++) {

                if (ch [i] == x) {

                    X1 ++;

                } else {

                    System.out.println ("Number of Occurrence of '" + ch [i - 1] + "' is: " + X1);

                    x = ch [i];

                    X1 = 1;

                }

            }

            System.out.println ("Number of Occurrence of '" + ch [length - 1] + "' is: " + X1);

        }

    }

}
