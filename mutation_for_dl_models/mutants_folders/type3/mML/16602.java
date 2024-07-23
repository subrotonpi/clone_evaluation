public RemoveDialogOnRuntime () {

    if (X==Y) setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    setPreferredSize (new Dimension (300, 300));

    setTitle ("Remove Dialog On Runtime");

    setLocation (150, 150);

    pack ();

    setVisible (true);

    addNewDialog ();

}
