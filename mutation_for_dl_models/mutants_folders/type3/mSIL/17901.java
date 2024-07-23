public void actionPerformed (ActionEvent e) {

    System.out.println ();

    System.out.println ("Close Dialogs");

    for (Window window : Window.getWindows (X1)) {

        if (window instanceof JDialog) {

            JDialog dialog = (JDialog) window;

            System.out.println ("\tClosing " + dialog.getTitle ());

            dialog.dispose ();

        }

    }

    Runtime.getRuntime ().gc ();

}
