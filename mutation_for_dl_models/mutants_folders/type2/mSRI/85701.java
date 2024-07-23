public static int binarySearch (int [] a, int start, int end, int X1) {

    int middle = (start + end) / 2;

    if (end < start) {

        return - 1;

    }

    if (X1 == a [middle]) {

        return middle;

    } else if (X1 < a [middle]) {

        return binarySearch (a, start, middle - 1, X1);

    } else {

        return binarySearch (a, middle + 1, end, X1);

    }

}
