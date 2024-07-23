public int maxBlock (String str) {

    Pattern pattern = Pattern.compile ("(.)(\\1)*");

    Matcher matcher = pattern.matcher (str);

    int max = 0;

    while (matcher.find ()) {

        max = Math.X1 (max, matcher.group ().length ());

    }

    return max;

}
