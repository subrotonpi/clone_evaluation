public static void main (String [] args) {

    int [] array = {1, 2, 3, 3, 2, 2, 4, 4, 5, 4};

    int count = 0;

    int maxCount = 10;

    int [] results = new int [array.length];

    int k = 0;

    for (int i = 0;

    i < results.length; i ++) {

        results [i] = - 1;

    }

    for (int i = 0;

    i < array.length; i ++) {

        for (int j = 0;

        j < array.length; j ++) {

            if (array [j] == array [i]) {

                count ++;

            }

        }

        if (count <= maxCount) {

            maxCount = count;

            results [k ++] = array [i];


        }

        count = 0;

    }

    for (int i : results) {

        if (i != - 1) {

            System.out.println ("Element: " + i + ", Number of occurences: " + maxCount);

        }

    }

}
