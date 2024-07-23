public static void type (String characters) {

    Clipboard clipboard = Toolkit.getDefaultToolkit ().getSystemClipboard ();

    StringSelection X1 = new StringSelection (characters);

    clipboard.setContents (X1, clipboardOwner);

    robot.keyPress (KeyEvent.VK_CONTROL);

    robot.keyPress (KeyEvent.VK_V);

    robot.keyRelease (KeyEvent.VK_V);

    robot.keyRelease (KeyEvent.VK_CONTROL);

}
