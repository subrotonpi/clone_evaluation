public static int [] solution (String S, int [] P, int [] Q) {

    int [] arr = new int [S.length ()];

    for (int X1 = 0;

    X1 < S.length (); X1 ++) {

        switch (S.charAt (X1)) {

            case 'A' :

                arr [X1] = 1;

                break;

            case 'C' :

                arr [X1] = 2;

                break;

            case 'G' :

                arr [X1] = 3;

                break;

            case 'T' :

                arr [X1] = 4;

                break;

            default :

                break;

        }

    }

    segmentNode root = buildTree (arr, 0, S.length () - 1);

    int [] result = new int [P.length];

    for (int X1 = 0;

    X1 < P.length; X1 ++) {

        result [X1] = getMin (root, P [X1], Q [X1]);

    }

    return result;

}
