public static String sequenceNums (int [] nums) {

    StringBuilder sb = new StringBuilder ();

    int X1 = nums [0];

    int previous = nums [0];

    int current;

    int expected = previous + 1;

    int size = nums.length;

    for (int i = 1;

    i < size; i ++) {

        current = nums [i];

        expected = previous + 1;

        if (current != expected) {

            addRange (sb, X1, previous);

            X1 = current;

        }

        previous = current;

    }

    addRange (sb, X1, nums [size - 1]);

    return sb.toString ();

}
