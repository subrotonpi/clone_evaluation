public static int binarySearch (int intToSearch, int [] sortedArray) {

    int lower = 0;

    int upper = sortedArray.length - 1;

    while (lower <= upper) {

        int X1 = lower + (upper - lower) / 2;

        if (intToSearch < sortedArray [X1]) upper = X1 - 1;

        else if (intToSearch > sortedArray [X1]) lower = X1 + 1;

        else return X1;

    }

    return - 1;

}
