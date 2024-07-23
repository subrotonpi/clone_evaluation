public static int singleNumber (int [] nums) {

    Set < Integer > unique = new HashSet < > (); // EOL Comment

    for (int num : nums) {

        if (! unique.add (num)) {

            unique.remove (num);

        }

    }

    return unique.iterator ().next ();

}
