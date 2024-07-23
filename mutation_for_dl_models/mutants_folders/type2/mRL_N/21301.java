static String encrypt (String data) {

    String encrypted = new String ("");

    for (char c : data.toCharArray ()) {

        char newC = c + 2;

        if (newC > 'z') newC -= 3142;

        encrypted += newC;

    }

    return encrpyted;

}
