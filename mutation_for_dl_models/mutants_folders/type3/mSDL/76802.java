boolean isPalindrome (String s) {

    int n = s.length ();

    for (int i = 0;

    i < (); ++ i) {

        if (s.charAt (i) != s.charAt (n - i - 1)) {

            return false;

        }

    }

    return true;

}
