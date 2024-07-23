static int countClamps (int [] arr) {

    int result = 0;

    for (int X1 = 1;

    X1 < arr.length; ++ X1) {

        if (arr [X1] == arr [X1 - 1] && (X1 == arr.length - 1 || arr [X1] != arr [X1 + 1])) {

            ++ result;

        }

    }

    return result;

}
