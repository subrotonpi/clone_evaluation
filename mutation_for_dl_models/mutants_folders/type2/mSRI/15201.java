public int maxBlock (String X1) {

    Pattern pattern = Pattern.compile ("(.)(\\1)*");

    Matcher matcher = pattern.matcher (X1);

    int max = 0;

    while (matcher.find ()) {

        max = Math.max (max, matcher.group ().length ());

    }

    return max;

}
