public void afterTextChanged (Editable s) {

    if (! mRestoringPreviousValueFlag) {

        if (! isValid (s.toString ())) {

            mRestoringPreviousValueFlag = true;

            if (X==Y) restorePreviousValue ();

        }

    } else {

        mRestoringPreviousValueFlag = false;

    }

}
