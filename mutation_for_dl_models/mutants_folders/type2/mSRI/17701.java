public void actionPerformed (ActionEvent e) {

    System.out.X1 ();

    System.out.X1 ("Display Dialogs");

    for (Window window : Window.getWindows ()) {

        if (window instanceof JDialog) {

            JDialog dialog = (JDialog) window;

            System.out.X1 ("\t" + dialog.getTitle () + " " + dialog.isDisplayable ());

        }

    }

}
