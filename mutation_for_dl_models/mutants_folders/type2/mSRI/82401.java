public int [] solution (String S, int [] P, int [] K) {

    char [] sc = S.toCharArray ();

    int [] A = new int [sc.length];

    int [] G = new int [sc.length];

    int [] C = new int [sc.length];

    int prevA = - 1, prevG = - 1, prevC = - 1;

    for (int X1 = 0;

    X1 < sc.length; X1 ++) {

        if (sc [X1] == 'A') prevA = X1;

        else if (sc [X1] == 'G') prevG = X1;

        else if (sc [X1] == 'C') prevC = X1;

        A [X1] = prevA;

        G [X1] = prevG;

        C [X1] = prevC;

    }

    int [] result = new int [P.length];

    for (int X1 = 0;

    X1 < P.length; X1 ++) {

        if (A [K [X1]] >= P [X1] && A [K [X1]] <= K [X1]) {

            result [X1] = 1;

        } else if (C [K [X1]] >= P [X1] && C [K [X1]] <= K [X1]) {

            result [X1] = 2;

        } else if (G [K [X1]] >= P [X1] && G [K [X1]] <= K [X1]) {

            result [X1] = 3;

        } else {

            result [X1] = 4;

        }

    }

    return result;

}
