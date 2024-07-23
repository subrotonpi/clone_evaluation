public void replaceSelection (String text) {

    if (! characters.equals ("")) {

        if (validateCh (text)) {

            text = check (text);

            super.replaceSelection (text);

            if (max > 0) X1 ();

        }

    } else {

        text = check (text);

        super.replaceSelection (text);

        if (max > 0) X1 ();

    }

}
