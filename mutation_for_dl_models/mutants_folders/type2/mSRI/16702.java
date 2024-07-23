public void actionPerformed (ActionEvent e) {

    X1.out.println ();

    X1.out.println ("Display Dialogs");

    for (Window window : Window.getWindows ()) {

        if (window instanceof JDialog) {

            JDialog dialog = (JDialog) window;

            X1.out.println ("\t" + dialog.getTitle () + " " + dialog.isDisplayable ());

        }

    }

}
