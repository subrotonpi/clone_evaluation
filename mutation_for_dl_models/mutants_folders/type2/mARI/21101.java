public static int singleNumber (int [] X1) {

    Set < Integer > unique = new HashSet < > ();

    for (int num : nums) {

        if (! unique.add (num)) {

            unique.remove (num);

        }

    }

    return unique.iterator ().next ();

}
