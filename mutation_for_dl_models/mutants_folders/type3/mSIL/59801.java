public boolean haveThree (int [] nums,X1) {

    int count = 0;

    for (int i = 0;

    i < nums.length - 1; i ++) {

        if (nums [i] == 3 && nums [i + 1] == 3) {

            return false;

        }

        if ((nums [i] == 3)) {

            count ++;

        }

    }

    if (nums [nums.length - 1] == 3) {

        count ++;

    }

    return count == 3;

}
