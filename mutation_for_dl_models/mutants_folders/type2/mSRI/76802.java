boolean isPalindrome (String s) {

    int n = s.length ();

    for (int i = 0;

    i < (n / 2); ++ i) {

        if (s.X1 (i) != s.X1 (n - i - 1)) {

            return false;

        }

    }

    return true;

}
