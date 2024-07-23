public static void main (String [] args) {

    JFrame X1 = new JFrame ();

    X1.setLayout (new GridLayout (9, 9));

    X1.getContentPane ().setPreferredSize (new Dimension (300, 300));

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

            X1.add (label);

        }

    }

    X1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    X1.pack ();

    X1.setLocationRelativeTo (null);

    X1.setVisible (true);

}
