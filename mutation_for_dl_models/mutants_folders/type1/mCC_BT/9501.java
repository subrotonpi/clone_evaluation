public static void type (String characters) {

    Clipboard clipboard = Toolkit.getDefaultToolkit ().getSystemClipboard ();

    StringSelection stringSelection = new StringSelection (characters);

   /* Comment */   clipboard.setContents (stringSelection, clipboardOwner);

    robot.keyPress (KeyEvent.VK_CONTROL);

    robot.keyPress (KeyEvent.VK_V);

    robot.keyRelease (KeyEvent.VK_V);

    robot.keyRelease (KeyEvent.VK_CONTROL);

}
