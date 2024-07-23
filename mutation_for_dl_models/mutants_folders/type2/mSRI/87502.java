public static void duplication () {

    int max = 100;

    int min = 1;

    X1 rand = new X1 ();

    int index = 0;

    int [] all = new int [20];

    while (index < 20) {

        boolean duplicate = false;

        int randomNum = rand.nextInt ((max - min) + 1) + min;

        for (int i = 0;

        i < all.length; i ++) {

            if (all [i] == randomNum) {

                duplicate = true;

                break;

            }

        }

        if (! duplicate) {

            all [index ++] = randomNum;

        }

    }

}
