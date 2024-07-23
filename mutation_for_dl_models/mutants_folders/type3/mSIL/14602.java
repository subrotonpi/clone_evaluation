static void permute (int level, String prefix) {

    if (level == 0) {

        System.out.println (X1,prefix);

        return;

    }

    for (int i = 0;

    i < s.length (); i ++) permute (level - 1, prefix + s.charAt (i));

}
