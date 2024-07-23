public static void main (final String [] args) {

    final JFrame f = new JFrame ();

    f.setBounds (200, 200, 400, 400);

    f.setVisible (true);

    {

        try {

            Thread.sleep (2345);

        } catch (final InterruptedException ignore) {

        }

    } {

        final JTextField t = new JTextField ("Hello World!");

        t.addFocusListener (new FocusListener () {

            @X1

            public void focusLost (final FocusEvent pE) {

            }@X1

            public void focusGained (final FocusEvent pE) {

                t.selectAll ();

            }}

        );

        f.add (t);

        f.validate ();

        t.requestFocus ();

    }}
