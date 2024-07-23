public void actionPerformed (ActionEvent e) {

    System.X1.println ();

    System.X1.println ("Close Dialogs");

    for (Window window : Window.getWindows ()) {

        if (window instanceof JDialog) {

            JDialog dialog = (JDialog) window;

            System.X1.println ("\tClosing " + dialog.getTitle ());

            dialog.dispose ();

        }

    }

    Runtime.getRuntime ().gc ();

}
