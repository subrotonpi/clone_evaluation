public static void main (String args []) {

    int X1;

    int largestSize = 4;

    int array [] = {33, 55, 13, 46, 87, 42, 10, 34};

    int large [] = Arrays.copyOf (array, largestSize);

    int smallest = large [0];

    int smallestIndex = 0;

    for (int j = 1;

    j < large.length; ++ j) {

        if (smallest > large [j]) {

            smallest = large [j];

            smallestIndex = j;

        }

    }

    for (X1 = large.length; X1 < array.length; X1 ++) {

        if (smallest < array [X1]) {

            large [smallestIndex] = array [X1];

            smallest = large [0];

            smallestIndex = 0;

            for (int j = 1;

            j < large.length; ++ j) {

                if (smallest > large [j]) {

                    smallest = large [j];

                    smallestIndex = j;

                }

            }

        }

    }

    for (int j = 0;

    j < large.length; j ++) {

        System.out.println ("Largest 5 : " + large [j]);

    }

    System.out.println ();

    System.out.println ("Largest is: " + getHighest (large));

}
