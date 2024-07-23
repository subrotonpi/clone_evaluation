public static int binarySearch (int anArray [], int first, int last, int value) {

    do {

        if (first > last) {

            return - 1;

        } else {

            int X1 = (first + last) / 2;

            if (value == anArray [X1]) {

                return X1;

            } else if (value < anArray [X1]) {

                last = X1 - 1;

            } else {

                first = X1 + 1;

            }

        }

    } while (true);

}
