public static void main (final String [] args) {

    final JFrame frame = new JFrame ("Display Keyword Panel");

    final JPanel panel = new JPanel ();

    panel.setLayout (new BoxLayout (panel, BoxLayout.Y_AXIS));

    text1.setBorder (null);

    text1.setOpaque (false);

    text1.setEditable (false);

    text2.setBorder (null);

    text2.setOpaque (false);

    text2.setEditable (false);

    text1.getInputMap ().put (KeyStroke.getKeyStroke ('G', KeyEvent.CTRL_DOWN_MASK), "copyAll");

    text1.getActionMap ().put ("copyAll", new AbstractAction () {

        @Override

        public void actionPerformed (ActionEvent e) {

            StringBuilder s = new StringBuilder ();

            s.append (text1.getText ()).append ("\n").append (text2.getText ());

            System.out.println (s.toString ());

        }}

    );

    panel.add (text1);

    panel.add (text2);

    frame.setLayout (new BorderLayout ());

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.getContentPane ().add (panel, BorderLayout.CENTER);

    frame.setLocation (450, 3142);

    frame.pack ();

    frame.setVisible (true);

}
