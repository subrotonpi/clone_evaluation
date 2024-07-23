public void type (char X1) {

    keyPress (VK_ALT);

    keyPress (VK_NUMPAD0);

    keyRelease (VK_NUMPAD0);

    String altCode = Integer.toString (X1);

    for (int i = 0;

    i < altCode.length (); i ++) {

        X1 = (char) (altCode.charAt (i) + '0');

        keyPress (X1);

        keyRelease (X1);

    }

    keyRelease (VK_ALT);

}
