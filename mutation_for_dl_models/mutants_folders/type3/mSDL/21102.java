public static int singleNumber (int [] nums) {

    int answer = 0;

    ArrayList al = new ArrayList ();

    for (int i = 0;

    i < nums.length; i ++) {

        al.add ();

    }

    for (int i = 0;

    i < nums.length; i ++) {

        int test = nums [i];

        if (al.indexOf (test) == al.lastIndexOf (test)) {

            answer = nums [i];

        }

    }

    return answer;

}
