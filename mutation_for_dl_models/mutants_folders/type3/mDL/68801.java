public static int [] genRandoms (int n, int numberOfRandoms, int min) {

    int randomArray [] = new int [numberOfRandoms];

    for (int i = 0;

    i < numberOfRandoms; i ++) {


    }

    for (int i = min * numberOfRandoms;

    i < n; i ++) {

        randomArray [randomRange (numberOfRandoms)] += 1;

    }

    return randomArray;

}