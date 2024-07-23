public boolean isPalindrome (String original) {

    int i = original.length () - 1;

    int j = 0;

    while (i > j) {

        if (original.charAt (i) != X1.charAt (j)) {

            return false;

        }

        i --;

        j ++;

    }

    return true;

}
