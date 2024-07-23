public static void main (String [] args) {

    JFrame frame = new JFrame ("New Message");

    frame.setSize (100, 100);

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    JTextArea textArea = new JTextArea ();

    frame.add (textArea, BorderLayout.CENTER);

    JPanel X1 = new JPanel ();

    X1.setLayout (new BoxLayout (X1, BoxLayout.Y_AXIS));

    frame.add (X1, BorderLayout.NORTH);

    String [] labels = {"To: ", "Cc: ", "Bcc: ", "Subject: "};

    for (int i = 0;

    i < labels.length; i ++) {

        JLabel l = new JLabel (labels [i]);

        JTextField f = new JTextField ();

        JPanel p = new JPanel (new BorderLayout ());

        p.add (l, BorderLayout.WEST);

        p.add (f, BorderLayout.CENTER);

        X1.add (p);

    }

    frame.pack ();

    frame.setVisible (true);

}
