public int maxBlock (String str) {

    Pattern pattern = Pattern.compile ("(.)(\\1)*");

    Matcher matcher = pattern.matcher (str);

    int max = 0;

    while (matcher.find ()) {


    }

    return max;

}
