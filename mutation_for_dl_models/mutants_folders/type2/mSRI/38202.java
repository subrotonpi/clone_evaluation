public void sort (int [] input) {

    for (int i = 0;

    i < input.length - 1; i ++) {

        int X1 = i + 1;

        int nxtVal = input [X1];

        while (input [X1 - 1] > nxtVal) {

            input [X1] = input [X1 - 1];

            X1 --;

            if (X1 == 0) break;

        }

        input [X1] = nxtVal;

    }

    System.out.println ("Medium sorting is done and the result is :");

    for (int i : input) {

        System.out.print (i + ",");

    }

}
