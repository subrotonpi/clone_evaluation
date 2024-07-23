public void duplication () {

    int X1 = 100;

    int min = 1;

    boolean duplicate = false;

    Random rand = new Random ();

    int [] all = new int [20];

    for (int x = 0;

    x < 20; x ++) {

        duplicate = false;

        int randomNum = rand.nextInt ((max - min) + 1) + min;

        for (int i : all) {

            if (i == randomNum) {

                duplicate = true;

                break;

            }

        }

        if (duplicate) {

            x --;

        } else {

            all [x] = randomNum;

        }

    }

}
