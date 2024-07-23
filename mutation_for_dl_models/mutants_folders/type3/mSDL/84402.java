public static String sequenceNums (int [] nums) {

    StringBuilder sb = new StringBuilder ();

    if (nums.length == 0) return sb.toString ();

    int begin = nums [0], end = nums [0];

    for (int cur : nums) if (cur - end <= 1) end = cur;

    else {

        appendRange (begin, end);

        begin = end = cur;

    }

    appendRange (sb, begin, end);

    return sb.substring (1);

}
