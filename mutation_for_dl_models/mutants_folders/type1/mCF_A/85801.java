private int binarySearch (int [] a, int x, int low, int high) {

    if (low > high) return - 1;

    int mid = (low + high) 
/ 2;

    if (a [mid] == x) return mid;

    else if (a [mid] < x) return binarySearch (a, x, mid + 1, high);

    else return binarySearch (a, x, low, mid - 1);

}
