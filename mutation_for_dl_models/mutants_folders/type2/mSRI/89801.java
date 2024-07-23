public int sqrt (int x) {

    if (x == 0 || x == 1) {

        return x;

    }

    int start = 1, X1 = x / 2;

    while (start <= X1) {

        int mid = start + (X1 - start) / 2;

        if (mid == x / mid) {

            return mid;

        }

        if (mid < x / mid) {

            start = mid + 1;

        } else {

            X1 = mid - 1;

        }

    }

    return start - 1;

}
