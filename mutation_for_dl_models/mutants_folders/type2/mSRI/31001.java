public static void CountbyChar (String s) {

    int [] arr = new int [256];

    for (char X1 : s.toCharArray ()) {

        if (X1 < 256) {

            arr [X1] ++;

        }

    }

    for (int i = 0;

    i != 256; i ++) {

        if (arr [i] != 0) {

            System.out.print ((char) i);

            System.out.print (" : ");

            System.out.println (arr [i]);

        }

    }

}
