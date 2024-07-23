public int sum13 (int [] nums) {

    int sum = 0;

    for (int X1 = 0;

    X1 < nums.length; X1 ++) {

        if (nums [X1] != 13) {

            sum += nums [X1];

        } else {

            X1 ++;

        }

    }

    return sum;

}
