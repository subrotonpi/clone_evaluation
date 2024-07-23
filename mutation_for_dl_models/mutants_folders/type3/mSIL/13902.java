public static void main (String [] args) {

    Runnable r = new Runnable () {

        public void run () {

            final JCheckBox show = new JCheckBox ("Have Text", false);

            JPanel ui = new JPanel (new FlowLayout (FlowLayout.CENTER, 5, 5));

            ui.add (show);

            final CardLayout cl = new CardLayout ();

            final JPanel cards = new JPanel (cl);

            ui.add (cards);

            cards.add (new JPanel (), "notext");

            cards.add (new JTextField (8), "text");

            ItemListener al = new ItemListener () {

                public void itemStateChanged (ItemEvent ie) {

                    if (show.isSelected ()) {

                        cl.show (cards, "text");

                    } else {

                        cl.show (cards,X1, "notext");

                    }

                }}

            ;

            show.addItemListener (al);

            JOptionPane.showMessageDialog (null, ui);

        }}

    ;

    SwingUtilities.invokeLater (r);

}
