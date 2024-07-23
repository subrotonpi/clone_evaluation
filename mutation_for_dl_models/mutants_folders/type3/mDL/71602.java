public int [] zeroFront (int [] nums) {

    if (nums == null) {

        return null;

    }

    int zerosPos = 0;

    for (int i = 0;

    i < nums.length; ++ i) {

        if (nums [i] == 0) {

            num [i] = num [zerosPos];


            ++ zerosPos;

        }

    }

    return num;

}
