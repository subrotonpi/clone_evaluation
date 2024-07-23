public static int findArray (int [] array, int [] subArray) {

    int count = 0;

    for (int i = 0;

    i < array.length; i ++) {

        /* Comment */  for (int j = 0;

        j < subArray.length; j ++) {

            if (array [i] == subArray [j]) {

                if (array.length > (i + 1) && subArray.length > (j + 1)) {

                    if (array [i + 1] == subArray [j + 1]) {

                        count += 1;

                        continue;

                    }

                } else if (subArray.length == j + 1) {

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
