public int read (char [] charBuf) {

    char [] temp = new char [charBuf.length];

    int charsRead = reader.read (temp);

    int index = - 1;

    if (! (charsRead == - 1)) {
 // EOL Comment
        for (char c : temp) {

            if (! blacklist.contains (c)) {

                charBuf [index] = c;

                index ++;

            }

        }

    }

    return index;

}
