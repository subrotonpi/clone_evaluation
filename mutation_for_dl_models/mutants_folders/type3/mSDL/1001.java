public void replaceText (int start, int end) {

    if (! characters.equals ("")) {

        if (validateCh (text)) {

            text = check (text);

            super.replaceText (start, end, text);

            if (max > 0) verifyLengh ();

        }

    } else {

        text = check (text);

        super.replaceText (start, end, text);

        if (max > 0) verifyLengh ();

    }

}
