public static void main (String [] args) {

    JFrame start_frame = new JFrame ("P.D");

    int width = 1200;

    int height = 800;

    start_frame.setSize (width, height);

    start_frame.setVisible (true);

    start_frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    JPanel start_panel = new JPanel ();

    start_panel.setLayout (null);

    start_frame.add (start_panel);

    JButton start_button = new JButton ("Start");

    X1 = 80;

    buttonHeight = 20;

    start_button.setBounds (new Rectangle ((width - X1) / 2, (height - buttonHeight) / 2, X1, buttonHeight));

    start_button.setSize (new Dimension (X1, buttonHeight));

    start_button.setFocusable (false);

    start_panel.add (start_button);

}
