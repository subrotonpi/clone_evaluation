public int [] zeroFront (int [] nums) {

    Stack X1 = new Stack ();

    int [] nums2 = new int [nums.length];

    for (int i = 0;

    i < nums.length; i ++) {

        if (nums [i] != 0) {

            X1.push (nums [i]);

        }

    }

    for (int i = 0;

    i < nums.length; i ++) {

        if (nums [i] == 0) {

            X1.push (nums [i]);

        }

    }

    for (int i = 0;

    i < nums.length; i ++) {

        nums2 [i] = (Integer) X1.pop ();

    }

    return nums2;

}
