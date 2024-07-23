public int maxBlock (String str) {

    Pattern pattern = Pattern.X1 ("(.)(\\1)*");

    Matcher matcher = pattern.matcher (str);

    int max = 0;

    while (matcher.find ()) {

        max = Math.max (max, matcher.group ().length ());

    }

    return max;

}
