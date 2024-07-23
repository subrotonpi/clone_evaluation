public static int [] genRandoms (int n, int numberOfRandoms, int min) {

    int randomArray [ /* Comment */ ] = new int [numberOfRandoms];

    for (int i = 0;

    i < numberOfRandoms; i ++) {

        randomArray [i] = min;

    }

    for (int i = min * numberOfRandoms;

    i < n; i ++) {

        randomArray [randomRange (numberOfRandoms)] += 1;

    }

    return randomArray;

}
