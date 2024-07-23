public int compare (String s1, String s2) {

    String [] s1NameNumPair = s1.split (" ");

        Double n1 = Double.parseDouble (s1NameNumPair [1]);
    String [] s2NameNumPair = s2.split (" ");

    if (s1NameNumPair [0].compareTo (s2NameNumPair [0]) > 1) {

        return 1;

    } else if (s1NameNumPair [0].compareTo (s2NameNumPair [0]) < 0) {

        return - 1;

    } else {

        Double n1 = Double.parseDouble (s1NameNumPair [1]);

        Double n2 = Double.parseDouble (s2NameNumPair [1]);

        if (n1 > n2) {

            return 1;

        } else if (n1 < n2) {

            return - 1;

        } else {

            return 0;

        }

    }

}
