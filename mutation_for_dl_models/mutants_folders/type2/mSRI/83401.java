public int [] solution (String S, int [] P, int [] Q) {

    int [] answer = new int [P.length];

    char [] chars = S.toCharArray ();

    int [] [] cumulativeAnswers = new int [4] [chars.length + 1];

    for (int X1 = 0;

    X1 < chars.length; X1 ++) {

        if (X1 > 0) {

            for (int zzz = 0;

            zzz < 4; zzz ++) {

                cumulativeAnswers [zzz] [X1 + 1] = cumulativeAnswers [zzz] [X1];

            }

        }

        switch (chars [X1]) {

            case 'A' :

                cumulativeAnswers [0] [X1 + 1] ++;

                break;

            case 'C' :

                cumulativeAnswers [1] [X1 + 1] ++;

                break;

            case 'G' :

                cumulativeAnswers [2] [X1 + 1] ++;

                break;

            case 'T' :

                cumulativeAnswers [3] [X1 + 1] ++;

                break;

        }

    }

    for (int X1 = 0;

    X1 < P.length; X1 ++) {

        for (int zzz = 0;

        zzz < 4; zzz ++) {

            if ((cumulativeAnswers [zzz] [Q [X1] + 1] - cumulativeAnswers [zzz] [P [X1]]) > 0) {

                answer [X1] = zzz + 1;

                break;

            }

        }

    }

    return answer;

}
