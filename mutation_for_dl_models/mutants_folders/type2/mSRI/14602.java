static void permute (int X1, String prefix) {

    if (X1 == 0) {

        System.out.println (prefix);

        return;

    }

    for (int i = 0;

    i < s.length (); i ++) permute (X1 - 1, prefix + s.charAt (i));

}
