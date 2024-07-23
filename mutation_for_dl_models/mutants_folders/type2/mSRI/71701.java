public int [] zeroFront (int [] nums) {

    Stack stack = new Stack ();

    int [] nums2 = new int [nums.length];

    for (int X1 = 0;

    X1 < nums.length; X1 ++) {

        if (nums [X1] != 0) {

            stack.push (nums [X1]);

        }

    }

    for (int X1 = 0;

    X1 < nums.length; X1 ++) {

        if (nums [X1] == 0) {

            stack.push (nums [X1]);

        }

    }

    for (int X1 = 0;

    X1 < nums.length; X1 ++) {

        nums2 [X1] = (Integer) stack.pop ();

    }

    return nums2;

}
