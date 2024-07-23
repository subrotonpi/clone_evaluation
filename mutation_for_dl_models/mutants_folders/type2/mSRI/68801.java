public static int [] genRandoms (int n, int numberOfRandoms, int min) {

    int randomArray [] = new int [numberOfRandoms];

    for (int X1 = 0;

    X1 < numberOfRandoms; X1 ++) {

        randomArray [X1] = min;

    }

    for (int X1 = min * numberOfRandoms;

    X1 < n; X1 ++) {

        randomArray [randomRange (numberOfRandoms)] += 1;

    }

    return randomArray;

}
