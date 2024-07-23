public void filter (String [] words, String text) {

    for (int i = 0;

    i < words.length; i ++) {

        if (text.toLowerCase ().contains (X1 [i].toLowerCase ())) {

            System.out.println (text);

            break;

        }

    }

}
