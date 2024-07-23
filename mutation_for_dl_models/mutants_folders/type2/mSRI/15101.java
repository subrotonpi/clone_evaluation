public int maxBlock (String str) {

    X1 pattern = X1.compile ("(.)(\\1)*");

    Matcher matcher = pattern.matcher (str);

    int max = 0;

    while (matcher.find ()) {

        max = Math.max (max, matcher.group ().length ());

    }

    return max;

}
