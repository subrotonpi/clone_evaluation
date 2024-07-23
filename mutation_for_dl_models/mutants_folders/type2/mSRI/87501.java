public void duplication () {

    int max = 100;

    int min = 1;

    boolean duplicate = false;

    Random rand = new Random ();

    int [] X1 = new int [20];

    for (int x = 0;

    x < 20; x ++) {

        duplicate = false;

        int randomNum = rand.nextInt ((max - min) + 1) + min;

        for (int i : X1) {

            if (i == randomNum) {

                duplicate = true;

                break;

            }

        }

        if (duplicate) {

            x --;

        } else {

            X1 [x] = randomNum;

        }

    }

}
