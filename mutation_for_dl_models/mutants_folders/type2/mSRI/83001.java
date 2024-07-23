public static int [] solution (String S, int [] P, int [] Q) {

    int [] X1 = new int [S.length ()];

    for (int i = 0;

    i < S.length (); i ++) {

        switch (S.charAt (i)) {

            case 'A' :

                X1 [i] = 1;

                break;

            case 'C' :

                X1 [i] = 2;

                break;

            case 'G' :

                X1 [i] = 3;

                break;

            case 'T' :

                X1 [i] = 4;

                break;

            default :

                break;

        }

    }

    segmentNode root = buildTree (X1, 0, S.length () - 1);

    int [] result = new int [P.length];

    for (int i = 0;

    i < P.length; i ++) {

        result [i] = getMin (root, P [i], Q [i]);

    }

    return result;

}
