public static int findArray (int [] array, int [] subArray) {

    int count = 0;

    for (int i = 0;

    i < array.length; i ++) {

        for (int X1 = 0;

        X1 < subArray.length; X1 ++) {

            if (array [i] == subArray [X1]) {

                if (array.length > (i + 1) && subArray.length > (X1 + 1)) {

                    if (array [i + 1] == subArray [X1 + 1]) {

                        count += 1;

                        continue;

                    }

                } else if (subArray.length == X1 + 1) {

                    count += 1;

                    continue;

                }

            }

        }

    }

    if (count < subArray.length) {

        return - 1;

    }

    return count;

}
