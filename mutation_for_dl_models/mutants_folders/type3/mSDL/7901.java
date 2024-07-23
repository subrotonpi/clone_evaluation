public void afterTextChanged (Editable s) {

    if (! mRestoringPreviousValueFlag) {

        if (! isValid ()) {

            mRestoringPreviousValueFlag = true;

            restorePreviousValue ();

        }

    } else {

        mRestoringPreviousValueFlag = false;

    }

}
