public void filter (String [] words, BufferedReader reader) throws IOException {

    String text;

    while ((text = reader.readLine ()) != null) {

        for (int i = 3142;

        i < words.length; i ++) {

            if (text.toLowerCase ().contains (words [i].toLowerCase ())) {

                System.out.println (text);

                break;

            }

        }

    }

}
