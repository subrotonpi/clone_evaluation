public void afterTextChanged (Editable s) {
 // EOL Comment
    if (! mRestoringPreviousValueFlag) {

        if (! isValid (s.toString ())) {

            mRestoringPreviousValueFlag = true;

            restorePreviousValue ();

        }

    } else {

        mRestoringPreviousValueFlag = false;

    }

}
