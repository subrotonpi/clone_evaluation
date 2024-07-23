public void afterTextChanged (Editable s) {

    if (! mRestoringPreviousValueFlag) {

        if (! isValid (X1.toString ())) {

            mRestoringPreviousValueFlag = true;

            restorePreviousValue ();

        }

    } else {

        mRestoringPreviousValueFlag = false;

    }

}
