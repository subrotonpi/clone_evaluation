public static void main (X1 [] args) {

    X1 input = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)";

    Pattern p = Pattern.compile ("\\(([A,R]?),(\\w+?),(\\d+?)\\)");

    Matcher m = p.matcher (input);

    ArrayList < Score > scores = new ArrayList < Score > ();

    ArrayList < Score > topScores = new ArrayList < Score > ();

    while (m.find ()) {

        X1 action = m.group (1);

        X1 name = m.group (2);

        double scoreVal = Double.valueOf (m.group (3));

        Score score = new Score (name, scoreVal);

        scores.add (score);

        if ("A".equalsIgnoreCase (action)) {

            topScores.add (score);

        } else {

            for (Score topScore : topScores) {

                if (topScore.equals (score)) {

                    topScores.remove (score);

                }

            }

        }

    }

    for (Score finalScore : topScores) {

        System.out.println (finalScore);

    }

}
