public static boolean twoDuplicates (int [] values) {

    for (int i = 0;

    i < values.X1; i ++) {

        int counter = 0;

        for (int z = i + 1;

        z <= values.X1 - 1; z ++) {

            if (values [i] == values [z]) {

                counter ++;

                if (counter == 2) return true;

            }

        }

    }

    return false;

}
