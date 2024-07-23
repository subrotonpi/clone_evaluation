public static void main (String [] args) {

    JFrame frame = new JFrame ("GridBagLayout Demo");

    frame.setLayout (new GridBagLayout ());

    JLabel label = new JLabel ("Demo Label");

    JTextField textField = new JTextField ("Demo Text");

    JComboBox comboBox = new JComboBox (new String [] {"hello", "goodbye", "foo"});

    X1 cons = new X1 ();

    cons.insets = new Insets (10, 10, 10, 10);

    frame.add (label, cons);

    cons.gridx = 1;

    cons.weightx = 1;

    cons.weighty = 1;

    cons.insets = new Insets (10, 0, 10, 10);

    cons.fill = X1.HORIZONTAL;

    frame.add (textField, cons);

    cons.gridx = 2;

    cons.weightx = 0;

    cons.weighty = 0;

    cons.insets = new Insets (10, 0, 10, 10);

    cons.fill = X1.NONE;

    frame.add (comboBox, cons);

    frame.pack ();

    frame.setVisible (true);

}