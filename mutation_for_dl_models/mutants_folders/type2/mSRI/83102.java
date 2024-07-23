public int [] solution (String S, int [] P, int [] Q) {

    int [] answer = new int [P.length];

    char [] chars = S.toCharArray ();

    int [] [] X1 = new int [4] [chars.length + 1];

    for (int iii = 0;

    iii < chars.length; iii ++) {

        if (iii > 0) {

            for (int zzz = 0;

            zzz < 4; zzz ++) {

                X1 [zzz] [iii + 1] = X1 [zzz] [iii];

            }

        }

        switch (chars [iii]) {

            case 'A' :

                X1 [0] [iii + 1] ++;

                break;

            case 'C' :

                X1 [1] [iii + 1] ++;

                break;

            case 'G' :

                X1 [2] [iii + 1] ++;

                break;

            case 'T' :

                X1 [3] [iii + 1] ++;

                break;

        }

    }

    for (int iii = 0;

    iii < P.length; iii ++) {

        for (int zzz = 0;

        zzz < 4; zzz ++) {

            if ((X1 [zzz] [Q [iii] + 1] - X1 [zzz] [P [iii]]) > 0) {

                answer [iii] = zzz + 1;

                break;

            }

        }

    }

    return answer;

}
