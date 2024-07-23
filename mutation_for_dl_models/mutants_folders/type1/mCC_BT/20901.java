public static int singleNumber (int [] nums) {

    int temp = 0;

    int answer = 0;

    for (int i = 0;

    i < nums.length; i ++) {

        boolean flag = true;

        temp = nums [i];

        for (int j = 0;

      /* Comment */    j < nums.length; j ++) {

            if (temp == nums [j]) {

                if (i != j) {

                    flag = false;

                    break;

                }

            }

        }

        if (flag == true) {

            answer = temp;

        }

    }

    return answer;

}
