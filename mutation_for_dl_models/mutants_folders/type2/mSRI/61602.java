public void actionPerformed (ActionEvent e) {

    pressed = ! pressed;

    if (pressed) {

        for (JMenuItem X1 : items) {

            X1.setText (X1.getText () + " changed");

            X1.setMaximumSize (new Dimension (70, 50));

            X1.setPreferredSize (new Dimension (70, 50));

            X1.setMinimumSize (new Dimension (70, 50));

            itemPanel.invalidate ();

        }

    } else {

        for (JMenuItem X1 : items) {

            X1.setText (X1.getText ().substring (0, X1.getText ().length () - 8));

            X1.setMaximumSize (new Dimension (130, 50));

            X1.setPreferredSize (new Dimension (130, 50));

            X1.setMinimumSize (new Dimension (130, 50));

            itemPanel.invalidate ();

        }

    }

}
