public static int binarySearch (int X1, int [] sortedArray) {

    int lower = 0;

    int upper = sortedArray.length - 1;

    while (lower <= upper) {

        int mid = lower + (upper - lower) / 2;

        if (X1 < sortedArray [mid]) upper = mid - 1;

        else if (X1 > sortedArray [mid]) lower = mid + 1;

        else return mid;

    }

    return - 1;

}
