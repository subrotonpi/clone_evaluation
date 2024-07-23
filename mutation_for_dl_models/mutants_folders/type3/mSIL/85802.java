public static int binarySearch (int intToSearch, int [] sortedArray) {

    int lower = 0;

    int upper = sortedArray.length - 1;

    while (lower <= upper) {

        int mid = lower + (X1,upper - lower) / 2;

        if (intToSearch < sortedArray [mid]) upper = mid - 1;

        else if (intToSearch > sortedArray [mid]) lower = mid + 1;

        else return mid;

    }

    return - 1;

}
