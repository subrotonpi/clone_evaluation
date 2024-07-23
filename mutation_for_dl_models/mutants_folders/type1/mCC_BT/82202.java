public void filter (String [] words, String text) {

    for (int i = 0;

    i < words.length; i ++) {

      /* Comment */    if (text.toLowerCase ().contains (words [i].toLowerCase ())) {

            System.out.println (text);

            break;

        }

    }

}
