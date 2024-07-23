public int [] zeroFront (int [] nums) {

    if (nums == null) {

        return null;

    }

    int [] X1 = new int [nums.length];

    int zeroesPos = 0;

    int othersPos = X1.length - 1;

    for (int i = 0;

    i < nums.length; ++ i) {

        if (nums [i] == 0) {

            X1 [zeroesPos] = 0;

            ++ zeroesPos;

        } else {

            X1 [othersPos] = nums [i];

            -- othersPos;

        }

    }

    return X1;

}
