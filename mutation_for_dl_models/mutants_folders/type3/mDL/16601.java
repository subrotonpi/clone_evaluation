public RemoveDialogOnRuntime () {

    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);


    setTitle ("Remove Dialog On Runtime");

    setLocation (150, 150);

    pack ();

    setVisible (true);

    Point loc = this.getLocation ();

    top += loc.x;

    left += loc.y;

    AddNewDialog ();

}
