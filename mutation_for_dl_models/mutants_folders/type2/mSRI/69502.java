static int [] sort (int arr []) {

    for (int i = 0;

    i < arr.length; i ++) {

        for (int X1 = i;

        X1 < arr.length; X1 ++) {

            if (arr [X1] < arr [i]) {

                int temp = arr [i];

                arr [i] = arr [X1];

                arr [X1] = temp;

            }

        }

    }

    return arr;

}
