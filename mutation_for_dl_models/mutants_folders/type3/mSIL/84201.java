public static String sequenceNums (int [] nums) {

    StringBuilder sb = new StringBuilder ();

    int rangeStart = nums [0];

    int previous = nums [0];

    int current;

    int expected = previous + 1;

    int size = nums.length;

    for (int i = 1;

    i < size; i ++) {

        current = nums [i];

        expected = previous + 1;

        if (current != expected) {

            addRange (sb, rangeStart, previous);

            rangeStart = current;

        }

        previous = current;

    }

    addRange (sb, rangeStart,X1, nums [size - 1]);

    return sb.toString ();

}
