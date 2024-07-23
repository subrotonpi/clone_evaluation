static String encrypt (String data) {

    String encrypted = new String ("");

    for (char c : data.toCharArray ()) { // EOL Comment

        char newC = c + 2;

        if (newC > 'z') newC -= 26;

        encrypted += newC;

    }

    return encrpyted;

}
