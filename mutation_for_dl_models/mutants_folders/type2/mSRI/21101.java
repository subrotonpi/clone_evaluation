public static int singleNumber (int [] nums) {

    Set < Integer > X1 = new HashSet < > ();

    for (int num : nums) {

        if (! X1.add (num)) {

            X1.remove (num);

        }

    }

    return X1.iterator ().next ();

}
