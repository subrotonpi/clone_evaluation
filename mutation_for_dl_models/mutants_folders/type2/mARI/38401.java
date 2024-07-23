public void sort (int [] input) {

    for (int i = 0;

    X1 < input.length; i ++) {

        for (int j = i + 1;

        j < input.length; j ++) {

            if (input [i] > input [j]) {

                int tmp = input [i];

                input [i] = input [j];

                input [j] = tmp;

            }

        }

    }

    System.out.println ("Slow sorting is done and the result is :");

    for (int i : input) {

        System.out.print (i + ",");

    }

}
