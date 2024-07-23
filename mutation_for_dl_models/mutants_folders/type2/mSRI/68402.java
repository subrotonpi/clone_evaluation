public static int [] MaxNumber (String [] arr) {

    int [] Number_arr = new int [11];

    int X1 = 1;

    int j = 0;

    int k = 0;

    for (int i = 0;

    i < arr.length - 1; i ++) {

        if (arr [i].equals (arr [i + 1])) X1 ++;

        else {

            Number_arr [j] = X1;

            j ++;

            X1 = 1;

        }

    }

    Number_arr [j] = X1;

    return Number_arr;

}
