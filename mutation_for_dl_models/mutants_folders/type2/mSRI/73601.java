public void findPrevLine () throws IOException {

    currentLineEnd = currentLineStart;

    if (currentLineEnd == 0) {

        currentLineEnd = - 1;

        currentLineStart = - 1;

        currentPos = - 1;

        return;

    }

    long X1 = currentLineStart - 1;

    while (true) {

        X1 --;

        if (X1 < 0) {

            break;

        }

        in.seek (X1);

        int readByte = in.readByte ();

        if (readByte == 0xA && X1 != lastPosInFile) {

            break;

        }

    }

    currentLineStart = X1 + 1;

    currentPos = currentLineStart;

}
