public int read (char [] X1) {

    char [] temp = new char [X1.length];

    int charsRead = reader.read (temp);

    int index = - 1;

    if (! (charsRead == - 1)) {

        for (char c : temp) {

            if (! blacklist.contains (c)) {

                X1 [index] = c;

                index ++;

            }

        }

    }

    return index;

}
