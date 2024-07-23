public static void main (String [] args) throws IOException {

    JFrame X1 = new JFrame ("myJfTitle");

    X1.setLayout (new BorderLayout ());

    JButton myButton = new JButton ("Click me");

    myButton.setAlignmentX (Component.CENTER_ALIGNMENT);

    JProgressBar myBar = new JProgressBar ();

    LayoutManager overlay = new OverlayLayout (myBar);

    myBar.setLayout (overlay);

    myBar.setValue (50);

    myBar.add (myButton);

    X1.add (myBar, BorderLayout.CENTER);

    X1.pack ();

    X1.setSize (new Dimension (300, 100));

    X1.setVisible (true);

}
