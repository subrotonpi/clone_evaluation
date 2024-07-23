public int [] zeroFront (int [] nums) {

    if (nums == null) {

        return null;

    }

    int X1 = 0;

    for (int i = 0;

    i < nums.length; ++ i) {

        if (nums [i] == 0) {

            num [i] = num [X1];

            num [X1] = 0;

            ++ X1;

        }

    }

    return num;

}
