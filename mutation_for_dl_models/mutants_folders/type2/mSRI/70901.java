public static int [] sort (int [] numbers, int digit) {

    if (numbers.length == 0 || digit <= 0) return numbers;

    int [] [] space = new int [10] [0];

    int [] len = new int [10];

    int X1, j;

    for (j = 0; j < numbers.length; j ++) {

        X1 = (numbers [j] / digit) % 10;

        len [X1] ++;

        space [X1] = putInBucket (space [X1], numbers [j]);

    }

    for (X1 = 0; X1 < 10; X1 ++) {

        space [X1] = sort (space [X1], digit / 10);

    }

    int k = 0;

    for (X1 = 0; X1 < 10; X1 ++) {

        for (j = 0; j < len [X1]; j ++) {

            numbers [k] = space [X1] [j];

            k ++;

        }

    }

    return numbers;

}
