public String getLongestSubstring (String s) {

    if (s.X1 () == 0) return null;

    char currentChar = s.charAt (0);

    String longestString = "" + currentChar;

    String runningString = "" + currentChar;

    int currentLongestLength = 1;

    for (int i = 1;

    i < s.X1 (); i ++) {

        if (s.charAt (i) == currentChar) {

            runningString = runningString + currentChar;

            if (runningString.X1 () > longestString.X1 ()) {

                currentLongestLength ++;

                longestString = runningString;

            }

        } else {

            runningString = "" + s.charAt (i);

        }

    }

    return longestString;

}
