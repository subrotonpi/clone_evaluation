public static void main (String [] args) {

    JFrame frame = new JFrame ("Application Name");

    JPanel iconPanel = new JPanel ();

    JPanel grid = new JPanel (new FlowLayout ());

    X1 firewallButton = new X1 ("Firewall");

    X1 networkButton = new X1 ("Network");

    X1 printerButton = new X1 ("Printer");

    frame.add (iconPanel);

    iconPanel.add (firewallButton);

    iconPanel.add (networkButton);

    iconPanel.add (printerButton);

    grid.setBackground (Color.GREEN);

    frame.setLayout (new GridLayout (1, 2, 3, 3));

    frame.add (grid);

    frame.add (iconPanel);

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.pack ();

    frame.setLocationRelativeTo (null);

    frame.setVisible (true);

}
