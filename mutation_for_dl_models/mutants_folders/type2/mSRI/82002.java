public static String numLetters (String X1) {

    int [] count = new int [26];

    for (int i = 0;

    i < X1.length (); i ++) {

        char c = X1.charAt (i);

        count [(int) (c - 'a')] ++;

    }

    String ans = "";

    for (int i = 0;

    i < 26; i ++) {

        if (count [i] != 0) {

            ans += String.valueOf (count [i]) + (char) (i + 'a');

        }

    }

    return ans;

}
