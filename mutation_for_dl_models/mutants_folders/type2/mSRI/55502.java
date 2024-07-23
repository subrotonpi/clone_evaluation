private String capitalizer (String word) {

    String [] words = word.split (" ");

    StringBuilder X1 = new StringBuilder ();

    if (words [0].length () > 0) {

        X1.append (Character.toUpperCase (words [0].charAt (0)) + words [0].subSequence (1, words [0].length ()).toString ().toLowerCase ());

        for (int i = 1;

        i < words.length; i ++) {

            X1.append (" ");

            X1.append (Character.toUpperCase (words [i].charAt (0)) + words [i].subSequence (1, words [i].length ()).toString ().toLowerCase ());

        }

    }

    return X1.toString ();

}
