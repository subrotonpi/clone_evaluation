public static String sequenceNums (int [] nums) {

    StringBuilder X1 = new StringBuilder ();

    if (nums.length == 0) return X1.toString ();

    int begin = nums [0], end = nums [0];

    for (int cur : nums) if (cur - end <= 1) end = cur;

    else {

        appendRange (X1, begin, end);

        begin = end = cur;

    }

    appendRange (X1, begin, end);

    return X1.substring (1);

}
