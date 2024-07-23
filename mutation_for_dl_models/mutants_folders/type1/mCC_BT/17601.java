public void actionPerformed (ActionEvent e) {

    System.out.println ();

    System.out.println ("Display Dialogs");

    for (Window window : Window.getWindows ()) {

        if (window instanceof JDialog) {

            JDialog dialog = (JDialog) window;

            System.out.println ("\t" /* Comment */  + dialog.getTitle () + " " + dialog.isDisplayable ());

        }

    }

}
