public static int singleNumber (int [] nums) {

    int temp = 0;

    int answer = 0;

    for (int i = 0;

    i < nums.length; i ++) {

        boolean X1 = true;

        temp = nums [i];

        for (int j = 0;

        j < nums.length; j ++) {

            if (temp == nums [j]) {

                if (i != j) {

                    X1 = false;

                    break;

                }

            }

        }

        if (X1 == true) {

            answer = temp;

        }

    }

    return answer;

}
