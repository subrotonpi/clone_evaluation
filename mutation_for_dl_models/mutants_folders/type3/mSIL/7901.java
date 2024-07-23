public void afterTextChanged (Editable s) {

    if (! mRestoringPreviousValueFlag) {

        if (! isValid (s.toString ())) {

            mRestoringPreviousValueFlag = true;

            restorePreviousValue (X1);

        }

    } else {

        mRestoringPreviousValueFlag = false;

    }

}
