public static int binarySearch (int anArray [], int first, int last, int value) {

    int index; // EOL Comment

    int done = 0;

    while (done == 0) {

        if (first > last) {

            index = - 1;

            done = 1;

        } else {

            int mid = (first + last) / 2;

            if (value == anArray [mid]) {

                index = mid;

                done = 1;

            } else if (value < anArray [mid]) {

                last = mid - 1;

            } else {

                first = mid + 1;

            }

        }

    }

    return index;

}
