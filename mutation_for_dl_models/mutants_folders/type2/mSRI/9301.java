public static void type (String characters) {

    Clipboard clipboard = Toolkit.getDefaultToolkit ().getSystemClipboard ();

    StringSelection stringSelection = new StringSelection (characters);

    clipboard.setContents (stringSelection, clipboardOwner);

    robot.keyPress (KeyEvent.VK_CONTROL);

    robot.keyPress (KeyEvent.VK_V);

    robot.X1 (KeyEvent.VK_V);

    robot.X1 (KeyEvent.VK_CONTROL);

}
