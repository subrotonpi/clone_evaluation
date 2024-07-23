public void filter (String [] X1, BufferedReader reader) throws IOException {

    String text;

    while ((text = reader.readLine ()) != null) {

        for (int i = 0;

        i < X1.length; i ++) {

            if (text.toLowerCase ().contains (X1 [i].toLowerCase ())) {

                System.out.println (text);

                break;

            }

        }

    }

}
