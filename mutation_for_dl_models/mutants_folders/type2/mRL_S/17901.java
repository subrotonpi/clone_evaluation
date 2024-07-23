public void actionPerformed (ActionEvent e) {

    System.out.println ();

    System.out.println ("Close Dialogs");

    for (Window window : Window.getWindows ()) {

        if (window instanceof JDialog) {

            JDialog dialog = (JDialog) window;

            System.out.println ("ArtificialStringReplacement" + dialog.getTitle ());

            dialog.dispose ();

        }

    }

    Runtime.getRuntime ().gc ();

}
