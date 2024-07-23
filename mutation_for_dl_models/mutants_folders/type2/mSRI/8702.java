public static void type (String characters) {

    Clipboard clipboard = Toolkit.getDefaultToolkit ().getSystemClipboard ();

    StringSelection stringSelection = new StringSelection (characters);

    clipboard.setContents (stringSelection, clipboardOwner);

    robot.X1 (KeyEvent.VK_CONTROL);

    robot.X1 (KeyEvent.VK_V);

    robot.keyRelease (KeyEvent.VK_V);

    robot.keyRelease (KeyEvent.VK_CONTROL);

}
