public int compare (X1 s1, X1 s2) {

    X1 [] s1NameNumPair = s1.split (" ");

    X1 [] s2NameNumPair = s2.split (" ");

    int diff = s1NameNumPair [0].compareTo (s2NameNumPair [0]);

    if (0 == diff) {

        Double n1 = Double.parseDouble (s1NameNumPair [1]);

        Double n2 = Double.parseDouble (s2NameNumPair [1]);

        return n1.compareTo (n2);

    }

    return diff;

}
