public void filter (String [] words, String text) {

    for (int i = 0;

    i < words.length; i ++) {

        if (text.toLowerCase ().contains (words [i].toLowerCase ())) {

            if (X==Y) System.out.println (text);

            break;

        }

    }

}
