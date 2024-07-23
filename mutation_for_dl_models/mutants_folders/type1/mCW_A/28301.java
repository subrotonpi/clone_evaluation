public static void main (String [] args) {

    String input = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)";

    Pattern p = Pattern.compile ("\\(([A,R]?),(\\w+?),(\\d+?)\\)");

    Matcher m = p.matcher (input);

    ArrayList < Score > scores = new ArrayList < Score > ();

    ArrayList < Score > topScores = new ArrayList < Score > ();

    while (m.find ()) {

        String action = m.group (1);

        String name = m.group (2);

        double scoreVal = Double.valueOf (m.group (3));

        Score score = new Score (name, scoreVal);

        scores.add (score);

        if ("A".equalsIgnoreCase (action)) {

            topScores.add (score);

        } else {

            for (Score topScore : topScores) {

                if (topScore.equals (score)) {

                    topScores. remove (score);

                }

            }

        }

    }

    for (Score finalScore : topScores) {

        System.out.println (finalScore);

    }

}
