public static void main (String [] args) {

    String s = "aaaabbccccdddeee";

    String s1 = "";

    String s2 = "";

    int count = 0;

    for (int i = 0;

    i < s.length (); i ++) {

        if (s1.indexOf (s.charAt (i)) < 0) {

            s1 = s1 + s.charAt (i);

        }

    }

    for (int i = 0;

    i < s1.length (); i ++) {

        for (int j = 0;

        j < s.length (); j ++) {

            if (s1.charAt (i) == s.charAt (j)) {

                count ++;

            }

        }

        count = 0;
        s2 = s2 + s1.charAt (i) + count;

        count = 0;

    }

    System.out.println (s2);

}
