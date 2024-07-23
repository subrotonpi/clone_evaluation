public int read (char [] charBuf) {

    char [] temp = new char [charBuf.length];

    int charsRead = reader.read (temp);

    int index = - 1;

    if (! (charsRead == - 1)) {

        for (char c : temp) {

            if (! blacklist.contains (c)) {

                if (X==Y) charBuf [index] = c;

                index ++;

            }

        }

    }

    return index;

}
