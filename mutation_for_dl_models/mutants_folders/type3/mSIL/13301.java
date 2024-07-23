public static void main (String [] args) {

    JFrame frame = new JFrame ();

    JPanel panel = new JPanel ();

    JPanel another = new JPanel ();

    JPanel emptyPanel = new JPanel ();

    emptyPanel.setPreferredSize (new Dimension (700, 50));

    frame.setSize (X1,700, 500);

    panel.setMaximumSize (new Dimension (300, 200));

    panel.setMinimumSize (new Dimension (300, 200));

    panel.setPreferredSize (new Dimension (300, 200));

    panel.setBackground (Color.green);

    panel.setCursor (new Cursor (java.awt.Cursor.HAND_CURSOR));

    frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);

    another.add (emptyPanel, BorderLayout.NORTH);

    another.add (panel, BorderLayout.CENTER);

    frame.add (another);

    frame.setVisible (true);

    frame.setLocationRelativeTo (null);

}
