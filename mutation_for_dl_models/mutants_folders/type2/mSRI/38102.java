public void sort (int [] input) {

    for (int X1 = 0;

    X1 < input.length; X1 ++) {

        for (int j = X1 + 1;

        j < input.length; j ++) {

            if (input [X1] > input [j]) {

                int tmp = input [X1];

                input [X1] = input [j];

                input [j] = tmp;

            }

        }

    }

    System.out.println ("Slow sorting is done and the result is :");

    for (int X1 : input) {

        System.out.print (X1 + ",");

    }

}
