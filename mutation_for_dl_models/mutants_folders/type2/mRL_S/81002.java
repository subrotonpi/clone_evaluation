public void run () {

    try {

        UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName ());

    } catch (Exception ex) {

    }

    final JPanel panel = new JPanel ();

    panel.setBackground (Color.RED);

    final JFrame frame = new JFrame ("Test");

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.add (panel);

    JButton change = new JButton ("ArtificialStringReplacement");

    change.addActionListener (new ActionListener () {

        @Override

        public void actionPerformed (ActionEvent e) {

            long start = System.currentTimeMillis ();

            frame.remove (panel);

            long end = System.currentTimeMillis ();

            JPanel newPanel = new JPanel ();

            newPanel.setBackground (Color.BLUE);

            frame.add (newPanel);

            frame.validate ();

        }}

    );

    frame.add (change, BorderLayout.SOUTH);

    frame.setSize (100, 100);

    frame.setLocationRelativeTo (null);

    frame.setVisible (true);

}
