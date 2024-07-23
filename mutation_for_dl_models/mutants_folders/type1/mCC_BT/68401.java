public static int [] MaxNumber (String [] arr) {

    int [] Number_arr = new int [11];

    int count = 1;

    int j = /* Comment */  0;

    int k = 0;

    for (int i = 0;

    i < arr.length - 1; i ++) {

        if (arr [i].equals (arr [i + 1])) count ++;

        else {

            Number_arr [j] = count;

            j ++;

            count = 1;

        }

    }

    Number_arr [j] = count;

    for (int i = 0;

    i < Number_arr.length; i ++) {

        System.out.print (Number_arr [i] + "  ");

    }

    return Number_arr;

}
