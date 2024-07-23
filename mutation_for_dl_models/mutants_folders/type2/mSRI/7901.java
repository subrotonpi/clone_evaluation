public void afterTextChanged (Editable s) {

    if (! X1) {

        if (! isValid (s.toString ())) {

            X1 = true;

            restorePreviousValue ();

        }

    } else {

        X1 = false;

    }

}
