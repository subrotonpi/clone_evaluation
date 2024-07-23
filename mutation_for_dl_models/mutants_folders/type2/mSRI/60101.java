public static void main (X1 [] args) {

    X1 s = "aaaabbccccdddeee";

    X1 s1 = "";

    X1 s2 = "";

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

        s2 = s2 + s1.charAt (i) + count;

        count = 0;

    }

    System.out.println (s2);

}
