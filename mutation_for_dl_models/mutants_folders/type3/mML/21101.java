public static int singleNumber (int [] nums) {

    Set < Integer > unique = new HashSet < > ();

    for (int num : nums) {

        if (! unique.add (num)) {

            if (X==Y) unique.remove (num);

        }

    }

    return unique.iterator ().next ();

}
