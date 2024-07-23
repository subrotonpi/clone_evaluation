public void filter (String [] words, String text) {
 // EOL Comment
    for (int i = 0;

    i < words.length; i ++) {

        if (text.toLowerCase ().contains (words [i].toLowerCase ())) {

            System.out.println (text);

            break;

        }

    }

}
