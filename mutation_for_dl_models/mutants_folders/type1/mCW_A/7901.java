public void afterTextChanged (Editable s) {

    if (! mRestoringPreviousValueFlag) {

        if (! isValid (s.toString ())) { 

            mRestoringPreviousValueFlag = true;

            restorePreviousValue ();

        }

    } else {

        mRestoringPreviousValueFlag = false;

    }

}
