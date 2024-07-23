public int sum13 (int [] nums) {

    int sum = 0;

    boolean skipNext = false;

    for (int num : nums) {

        if (num == 13) {

            skipNext = true;

        } else {

            if (! skipNext) {

                 sum += num;

            }

            skipNext = false;

        }

    }

    return sum;

}
