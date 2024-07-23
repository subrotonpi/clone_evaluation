public RemoveDialogOnRuntime () {

    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    setPreferredSize (new Dimension (300, 300));

    setTitle ("Remove Dialog On Runtime");

    setLocation (150, 150);

    pack ();

    setVisible (true);

    Point X1 = this.getLocation ();

    top += X1.x;

    left += X1.y;

    AddNewDialog ();

}
