public void type (char c) {

    keyPress (VK_ALT);

    keyPress (VK_NUMPAD0);

    keyRelease (VK_NUMPAD0);

    String X1 = Integer.toString (c);

    for (int i = 0;

    i < X1.length (); i ++) {

        c = (char) (X1.charAt (i) + '0');

        keyPress (c);

        keyRelease (c);

    }

    keyRelease (VK_ALT);

}
