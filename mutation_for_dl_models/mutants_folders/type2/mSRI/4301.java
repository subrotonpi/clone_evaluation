public int sum13 (int [] nums) {

    int sum = 0;

    boolean X1 = false;

    for (int num : nums) {

        if (num == 13) {

            X1 = true;

        } else {

            if (! X1) {

                sum += num;

            }

            X1 = false;

        }

    }

    return sum;

}
