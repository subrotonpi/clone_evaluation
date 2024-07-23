public void replaceSelection (String text) {

    if (! characters.equals ("")) {

        if (validateCh (text)) { /* Comment */ 

            text = check (text);

            super.replaceSelection (text);

            if (max > 0) verifyLengh ();

        }

    } else {

        text = check (text);

        super.replaceSelection (text);

        if (max > 0) verifyLengh ();

    }

}
