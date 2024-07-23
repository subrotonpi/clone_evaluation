public int maxBlock (String str) {

    Pattern  /* Comment */ pattern = Pattern.compile ("(.)(\\1)*");

    Matcher matcher = pattern.matcher (str);

    int max = 0;

    while (matcher.find ()) {

        max = Math.max (max, matcher.group ().length ());

    }

    return max;

}
