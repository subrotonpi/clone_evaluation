private int binarySearch (int [] a, int X1, int low, int high) {

    if (low > high) return - 1;

    int mid = (low + high) / 2;

    if (a [mid] == X1) return mid;

    else if (a [mid] < X1) return binarySearch (a, X1, mid + 1, high);

    else return binarySearch (a, X1, low, mid - 1);

}
