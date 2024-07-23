public int [] solution (String S, int [] P, int [] Q) {

    int [] answer = new int [P.length];

    char [] chars = S.toCharArray ();

    int [] [] cumulativeAnswers = new int [4] [chars.length + 1];

    for (int iii = 0;

    iii < chars.length; iii ++) {

        if (iii > 0) {

            for (int X1 = 0;

            X1 < 4; X1 ++) {

                cumulativeAnswers [X1] [iii + 1] = cumulativeAnswers [X1] [iii];

            }

        }

        switch (chars [iii]) {

            case 'A' :

                cumulativeAnswers [0] [iii + 1] ++;

                break;

            case 'C' :

                cumulativeAnswers [1] [iii + 1] ++;

                break;

            case 'G' :

                cumulativeAnswers [2] [iii + 1] ++;

                break;

            case 'T' :

                cumulativeAnswers [3] [iii + 1] ++;

                break;

        }

    }

    for (int iii = 0;

    iii < P.length; iii ++) {

        for (int X1 = 0;

        X1 < 4; X1 ++) {

            if ((cumulativeAnswers [X1] [Q [iii] + 1] - cumulativeAnswers [X1] [P [iii]]) > 0) {

                answer [iii] = X1 + 1;

                break;

            }

        }

    }

    return answer;

}
