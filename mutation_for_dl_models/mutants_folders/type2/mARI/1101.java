public void replaceSelection (String text) {

    if (! characters.equals ("")) {

        if (validateCh (text)) {

            text = check (text);

            X1.replaceSelection (text);

            if (max > 0) verifyLengh ();

        }

    } else {

        text = check (text);

        super.replaceSelection (text);

        if (max > 0) verifyLengh ();

    }

}
