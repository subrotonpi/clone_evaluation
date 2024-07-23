public static String [] tokenizer (String text, String [] delims) {

    for (String delim : delims) {

        int i = text.indexOf (delim);

        if (i >= 0) {

            String [] tail = tokenizer (text.substring (i + delim.length ()), delims);

            String [] X1 = new String [tail.length + 2];

            X1 [0] = text.substring (0, i);

            X1 [1] = delim;

            System.arraycopy (tail, 0, X1, 2, tail.length);

            return X1;

        }

    }

    return new String [] {text};

}
