public static String output (String [] fourLetter, String [] fiveLetter, String [] sixLetter) {

    String answer = "";

    for (int i = 0;

    i < Math.max (sixLetter.length); i ++) {

        if (sixLetter.length > i) {

            answer += sixLetter [i] + " ";

        }

        if (fiveLetter.length > i) {

            answer += fiveLetter [i] + " ";

        }

        if (fourLetter.length > i) {

            answer += fourLetter [i];

        }

        answer += "\n";

    }

    return answer;

}
