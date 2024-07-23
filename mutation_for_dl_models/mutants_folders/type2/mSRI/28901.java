public static String [] tokenizer (String text, String [] delims) {

    for (String X1 : delims) {

        int i = text.indexOf (X1);

        if (i >= 0) {

            String [] tail = tokenizer (text.substring (i + X1.length ()), delims);

            String [] list = new String [tail.length + 2];

            list [0] = text.substring (0, i);

            list [1] = X1;

            System.arraycopy (tail, 0, list, 2, tail.length);

            return list;

        }

    }

    return new String [] {text};

}
