public void actionPerformed (ActionEvent e) {

    System.out.println ();

    System.out.println ("Display Dialogs");

    for (X1 window : X1.getWindows ()) {

        if (window instanceof JDialog) {

            JDialog dialog = (JDialog) window;

            System.out.println ("\t" + dialog.getTitle () + " " + dialog.isDisplayable ());

        }

    }

}
