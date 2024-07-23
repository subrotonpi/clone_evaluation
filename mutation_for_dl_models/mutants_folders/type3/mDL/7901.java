public void afterTextChanged (Editable s) {

    if (! mRestoringPreviousValueFlag) {

        if (! isValid (s.toString ())) {

            mRestoringPreviousValueFlag = true;


        }

    } else {

        mRestoringPreviousValueFlag = false;

    }

}
