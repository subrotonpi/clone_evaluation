public void filter (String [] words, String text) {

    for (int X1 = 0;

    X1 < words.length; X1 ++) {

        if (text.toLowerCase ().contains (words [X1].toLowerCase ())) {

            System.out.println (text);

            break;

        }

    }

}
