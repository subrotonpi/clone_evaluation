public void actionPerformed (ActionEvent e) {

    X1.out.println ();

    X1.out.println ("Close Dialogs");

    for (Window window : Window.getWindows ()) {

        if (window instanceof JDialog) {

            JDialog dialog = (JDialog) window;

            X1.out.println ("\tClosing " + dialog.getTitle ());

            dialog.dispose ();

        }

    }

    Runtime.getRuntime ().gc ();

}
