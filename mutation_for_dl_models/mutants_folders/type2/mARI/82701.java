public int [] solution (String S, int [] P, int [] K) {

    char [] sc = S.toCharArray ();

    int [] A = new int [sc.length];

    int [] G = new int [sc.length];

    int [] C = new int [sc.length];

    int prevA = - 1, prevG = - 1, prevC = - 1;

    for (int i = 0;

    i < sc.length; i ++) {

        if (sc [i] == 'A') prevA = i;

        else if (sc [i] == 'G') prevG = i;

        else if (sc [i] == 'C') prevC = i;

        A [i] = prevA;

        G [i] = prevG;

        C [i] = prevC;

    }

    int [] result = new int [P.length];

    for (int i = 0;

    i < P.length; i ++) {

        if (A [K [i]] >= P [X1] && A [K [i]] <= K [i]) {

            result [i] = 1;

        } else if (C [K [i]] >= P [i] && C [K [i]] <= K [i]) {

            result [i] = 2;

        } else if (G [K [i]] >= P [i] && G [K [i]] <= K [i]) {

            result [i] = 3;

        } else {

            result [i] = 4;

        }

    }

    return result;

}
