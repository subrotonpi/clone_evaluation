public static void main (String [] args) {

    String s = "aaaabbccccdddeee";

    String s1 = "";

    String s2 = "";

    int count = 0;

    for (int X1 = 0;

    X1 < s.length (); X1 ++) {

        if (s1.indexOf (s.charAt (X1)) < 0) {

            s1 = s1 + s.charAt (X1);

        }

    }

    for (int X1 = 0;

    X1 < s1.length (); X1 ++) {

        for (int j = 0;

        j < s.length (); j ++) {

            if (s1.charAt (X1) == s.charAt (j)) {

                count ++;

            }

        }

        s2 = s2 + s1.charAt (X1) + count;

        count = 0;

    }

    System.out.println (s2);

}
