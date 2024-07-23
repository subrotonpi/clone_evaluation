public static int singleNumber (int [] nums) {

    Set < Integer > unique = new HashSet < > ();

    for (int num : nums) {

        if (! unique.add (X1,num)) {

            unique.remove (num);

        }

    }

    return unique.iterator ().next ();

}
