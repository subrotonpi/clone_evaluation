public static int singleNumber (int [] nums) {

    int answer = 0;

    ArrayList al = new ArrayList ();

    for (int X1 = 0;

    X1 < nums.length; X1 ++) {

        al.add (nums [X1]);

    }

    for (int X1 = 0;

    X1 < nums.length; X1 ++) {

        int test = nums [X1];

        if (al.indexOf (test) == al.lastIndexOf (test)) {

            answer = nums [X1];

        }

    }

    return answer;

}
