public boolean isPalindrome (String X1) {

    int i = X1.length () - 1;

    int j = 0;

    while (i > j) {

        if (X1.charAt (i) != X1.charAt (j)) {

            return false;

        }

        i --;

        j ++;

    }

    return true;

}
