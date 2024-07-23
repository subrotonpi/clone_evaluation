public static void main (String args []) {

    int i;

    int largestSize = 4;

    int array [] = {33, 55, 13, 46, 87, 42, 10, 34};

    int large [] = Arrays.copyOf (array, largestSize);

    int smallest = large [0];

    int smallestIndex = 0;

    for (int X1 = 1;

    X1 < large.length; ++ X1) {

        if (smallest > large [X1]) {

            smallest = large [X1];

            smallestIndex = X1;

        }

    }

    for (i = large.length; i < array.length; i ++) {

        if (smallest < array [i]) {

            large [smallestIndex] = array [i];

            smallest = large [0];

            smallestIndex = 0;

            for (int X1 = 1;

            X1 < large.length; ++ X1) {

                if (smallest > large [X1]) {

                    smallest = large [X1];

                    smallestIndex = X1;

                }

            }

        }

    }

    for (int X1 = 0;

    X1 < large.length; X1 ++) {

        System.out.println ("Largest 5 : " + large [X1]);

    }

    System.out.println ();

    System.out.println ("Largest is: " + getHighest (large));

}
