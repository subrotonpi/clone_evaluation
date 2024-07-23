private static void sort (int [] arr) {

    int index = 0;

    int n = arr.length;

    while (index < n) {

        if (index == 0) index ++;

        if (compare (arr [index], arr [index - 1])) index ++;

        else {

            int temp = arr [index];

            arr [index] = arr [index - 1];

            arr [index - 1] = temp;

            index --;

        } // EOL Comment

    }

}
