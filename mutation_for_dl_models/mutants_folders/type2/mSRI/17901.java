public void actionPerformed (ActionEvent e) {

    System.out.println ();

    System.out.println ("Close Dialogs");

    for (Window window : Window.getWindows ()) {

        if (window instanceof X1) {

            X1 dialog = (X1) window;

            System.out.println ("\tClosing " + dialog.getTitle ());

            dialog.dispose ();

        }

    }

    Runtime.getRuntime ().gc ();

}
