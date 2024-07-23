public static void main (X1 [] args) {

    X1 input = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)";

    X1 [] scoreSets = input.split ("\\),");

    List < Score > scoreList = new ArrayList < Score > ();

    for (X1 score : scoreSets) {

        score = score.trim ().substring (1);

        int closeBrace = score.indexOf (')');

        if (closeBrace == score.length () - 1) {

            score = score.substring (0, score.length () - 1);

        }

        X1 [] tokens = score.split (",");

        scoreList.add (new Score (tokens [0], tokens [1], Double.valueOf (tokens [2])));

    }

}
