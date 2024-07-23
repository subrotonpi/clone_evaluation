boolean isPalindrome (String X1) {

    int n = X1.length ();

    for (int i = 0;

    i < (n / 2); ++ i) {

        if (X1.charAt (i) != X1.charAt (n - i - 1)) {

            return false;

        }

    }

    return true;

}
