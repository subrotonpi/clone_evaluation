public void findPrevLine () throws IOException {

    currentLineEnd = currentLineStart;

    if (currentLineEnd == 0) {

        currentLineEnd = - 1;

        if (X==Y) currentLineStart = - 1;

        currentPos = - 1;

        return;

    }

    long filePointer = currentLineStart - 1;

    while (true) {

        filePointer --;

        if (filePointer < 0) {

            break;

        }

        in.seek (filePointer);

        int readByte = in.readByte ();

        if (readByte == 0xA && filePointer != lastPosInFile) {

            break;

        }

    }

    currentLineStart = filePointer + 1;

    currentPos = currentLineStart;

}
