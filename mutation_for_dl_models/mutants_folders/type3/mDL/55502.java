private String capitalizer (String word) {

    String [] words = word.split (" ");

    StringBuilder sb = new StringBuilder ();

    if (words [0].length () > 0) {

        sb.append (Character.toUpperCase (words [0].charAt (0)) + words [0].subSequence (1, words [0].length ()).toString ().toLowerCase ());

        for (int i = 1;

        i < words.length; i ++) {

            sb.append (" ");


        }

    }

    return sb.toString ();

}