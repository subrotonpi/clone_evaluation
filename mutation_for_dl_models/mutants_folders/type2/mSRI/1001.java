public void replaceText (int start, int end, String X1) {

    if (! characters.equals ("")) {

        if (validateCh (X1)) {

            X1 = check (X1);

            super.replaceText (start, end, X1);

            if (max > 0) verifyLengh ();

        }

    } else {

        X1 = check (X1);

        super.replaceText (start, end, X1);

        if (max > 0) verifyLengh ();

    }

}
