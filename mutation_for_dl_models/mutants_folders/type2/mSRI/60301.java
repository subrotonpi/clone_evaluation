public static void main (String [] args) {

    String X1 = "aaaabbccccdddeee";

    String s1 = "";

    String s2 = "";

    int count = 0;

    for (int i = 0;

    i < X1.length (); i ++) {

        if (s1.indexOf (X1.charAt (i)) < 0) {

            s1 = s1 + X1.charAt (i);

        }

    }

    for (int i = 0;

    i < s1.length (); i ++) {

        for (int j = 0;

        j < X1.length (); j ++) {

            if (s1.charAt (i) == X1.charAt (j)) {

                count ++;

            }

        }

        s2 = s2 + s1.charAt (i) + count;

        count = 0;

    }

    System.out.println (s2);

}
