public boolean haveThree (int [] nums) {

    int count = 0;

    boolean flag = false;

    for (int X1 = 0;

    X1 < nums.length; X1 ++) {

        if (nums [X1] == 3) {

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
