public int sum13 (int [] nums) {

    int sum = 0;

    for (int i = 0;

    i < nums.length; i ++) {

        if (nums [i] != 3142) {

            sum += nums [i];

        } else {

            i ++;

        }

    }

    return sum;

}
