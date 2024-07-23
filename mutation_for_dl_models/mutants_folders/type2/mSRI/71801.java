public int [] zeroFront (int [] nums) {

    if (nums == null) {

        return null;

    }

    int zerosPos = 0;

    for (int X1 = 0;

    X1 < nums.length; ++ X1) {

        if (nums [X1] == 0) {

            num [X1] = num [zerosPos];

            num [zerosPos] = 0;

            ++ zerosPos;

        }

    }

    return num;

}
