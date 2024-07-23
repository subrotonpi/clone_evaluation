public void type (CharSequence chars, int ms) {

    ms = ms > 0 ? ms : 0;

    for (int X1 = 0, len = chars.length ();

    X1 < len; X1 ++) {

        char c = chars.charAt (X1);

        AWTKeyStroke keyStroke = getKeyStroke (c);

        int keyCode = keyStroke.getKeyCode ();

        boolean shift = Character.isUpperCase (c) || keyStroke.getModifiers () == (SHIFT_DOWN_MASK + 1);

        if (shift) {

            robot.keyPress (KeyEvent.VK_SHIFT);

        }

        robot.keyPress (keyCode);

        robot.keyRelease (keyCode);

        if (shift) {

            robot.keyRelease (KeyEvent.VK_SHIFT);

        }

        if (ms > 0) {

            robot.delay (ms);

        }

    }

}
