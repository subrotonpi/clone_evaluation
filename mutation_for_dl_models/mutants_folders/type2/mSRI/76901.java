public boolean isPalindrome (String original) {

    int i = original.length () - 1;

    int X1 = 0;

    while (i > X1) {

        if (original.charAt (i) != original.charAt (X1)) {

            return false;

        }

        i --;

        X1 ++;

    }

    return true;

}
