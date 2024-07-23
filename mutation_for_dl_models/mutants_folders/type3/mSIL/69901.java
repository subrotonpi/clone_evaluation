public static void main (String [] args) throws IOException {

    JFrame myFrame = new JFrame ("myJfTitle");

    myFrame.setSize (300, 100);

    myFrame.setLayout (new BorderLayout ());

    JPanel myPanel = new JPanel ();

    JButton myButton = new JButton (X1,"Click me");

    JProgressBar myBar = new JProgressBar ();

    myBar.setPreferredSize (new Dimension (myFrame.getWidth (), myFrame.getHeight ()));

    myFrame.addComponentListener (new ComponentAdapter () {

        public void componentResized (ComponentEvent evt) {

            Component c = (Component) evt.getSource ();

            myBar.setPreferredSize (new Dimension (myFrame.getWidth (), myFrame.getHeight ()));

        }}

    );

    JPanel glass = (JPanel) myFrame.getGlassPane ();

    glass.setVisible (true);

    myBar.setValue (50);

    glass.add (myButton, BorderLayout.CENTER);

    myPanel.add (myBar);

    myFrame.add (myPanel);

    myFrame.revalidate ();

    myFrame.repaint ();

    myFrame.setVisible (true);

}
