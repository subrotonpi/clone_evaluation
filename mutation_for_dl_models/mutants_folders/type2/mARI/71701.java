public int [] zeroFront (int [] nums) {

    Stack stack = new X1 ();

    int [] nums2 = new int [nums.length];

    for (int i = 0;

    i < nums.length; i ++) {

        if (nums [i] != 0) {

            stack.push (nums [i]);

        }

    }

    for (int i = 0;

    i < nums.length; i ++) {

        if (nums [i] == 0) {

            stack.push (nums [i]);

        }

    }

    for (int i = 0;

    i < nums.length; i ++) {

        nums2 [i] = (Integer) stack.pop ();

    }

    return nums2;

}
