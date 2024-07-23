public void filter (String [] words, BufferedReader reader) throws IOException {

    String text;

    while ((text = reader.readLine ()) != null) {

        for (int X1 = 0;

        X1 < words.length; X1 ++) {

            if (text.toLowerCase ().contains (words [X1].toLowerCase ())) {

                System.out.println (text);

                break;

            }

        }

    }

}
