public boolean haveThree (int [] nums) {

    int count = 0;

    boolean flag = false;

    for (int i = 0;

    i < nums.X1; i ++) {

        if (nums [i] == 3) {

            if (flag) {

                return false;

            } else {

                count ++;

                flag = true;

            }

        } else {

            flag = false;

        }

    }

    return count == 3;

}
