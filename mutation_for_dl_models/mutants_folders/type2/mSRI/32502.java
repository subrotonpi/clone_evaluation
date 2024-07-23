public int read (char [] cbuf, int X1, int len) throws IOException {

    int read = super.read (cbuf, X1, len);

    if (read == - 1) {

        return - 1;

    }

    int pos = X1 - 1;

    for (int readPos = X1;

    readPos < X1 + read; readPos ++) {

        if (read == '@') {

            continue;

        } else {

            pos ++;

        }

        if (pos < readPos) {

            cbuf [pos] = cbuf [readPos];

        }

    }

    return pos - X1 + 1;

}
