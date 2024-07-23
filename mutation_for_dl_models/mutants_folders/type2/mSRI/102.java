public static void main (String [] args) {

    String s = "this is a this is this a this yes this is a this what it may be i do not care about this";

    String a [] = s.split (" ");

    Map < String, Integer > words = new HashMap < > ();

    for (String X1 : a) {

        if (words.containsKey (X1)) {

            words.put (X1, 1 + words.get (X1));

        } else {

            words.put (X1, 1);

        }

    }

    System.out.println (words);

}
