public int read (char [] X1, int off, int len) throws IOException {

    int read = super.read (cbuf, off, len);

    if (read == - 1) {

        return - 1;

    }

    int pos = off - 1;

    for (int readPos = off;

    readPos < off + read; readPos ++) {

        if (read == '@') {

            continue;

        } else {

            pos ++;

        }

        if (pos < readPos) {

            cbuf [pos] = cbuf [readPos];

        }

    }

    return pos - off + 1;

}
