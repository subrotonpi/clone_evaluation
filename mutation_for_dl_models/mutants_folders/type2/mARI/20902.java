public static int singleNumber (int [] nums) {

    Set < Integer > unique = new HashSet < > ();

    for (int num : nums) {

        if (! unique.add (num)) {

            unique.remove (X1);

        }

    }

    return unique.iterator ().next ();

}
