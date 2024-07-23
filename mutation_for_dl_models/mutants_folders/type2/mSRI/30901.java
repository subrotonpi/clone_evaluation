public static void main (String [] args) {

    int [] array = {1, 2, 3, 3, 2, 2, 4, 4, 5, 4};

    int count = 0;

    int maxCount = 10;

    int [] results = new int [array.length];

    int k = 0;

    for (int X1 = 0;

    X1 < results.length; X1 ++) {

        results [X1] = - 1;

    }

    for (int X1 = 0;

    X1 < array.length; X1 ++) {

        for (int j = 0;

        j < array.length; j ++) {

            if (array [j] == array [X1]) {

                count ++;

            }

        }

        if (count <= maxCount) {

            maxCount = count;

            results [k ++] = array [X1];

        }

        count = 0;

    }

    for (int X1 : results) {

        if (X1 != - 1) {

            System.out.println ("Element: " + X1 + ", Number of occurences: " + maxCount);

        }

    }

}
