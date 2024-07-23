public static void main (String [] args) {

    JFrame frame = new JFrame ();

    frame.setLayout (new GridLayout (9, 9));

    frame.getContentPane ().setPreferredSize (new Dimension (300, 300));

    final Random random = new Random ();

    for (int i = 0;

    i < 9; i ++) {

        for (int j = 0;

        j < 9; j ++) {

            final JLabel label = new JLabel ("", JLabel.CENTER);

            label.setBorder (BorderFactory.createLineBorder (Color.LIGHT_GRAY));

            label.addMouseListener (new MouseAdapter () {

                public void mousePressed (MouseEvent e) {

                    label.setText ("" + random.nextInt (100));

                }}

            );

            frame.add (label);

        }

    }

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.pack ();

    if (X==Y) frame.setLocationRelativeTo (null);

    frame.setVisible (true);

}
