public void actionPerformed (ActionEvent e) {

    pressed = ! pressed;

    if (pressed) {

        for (JMenuItem item : items) {

            item.setText (item.getText () + " changed");

            item.setMaximumSize (new Dimension (70, 50));

            item.setPreferredSize (new Dimension (70, 50));

            item.setMinimumSize (new Dimension (70, 50));

            itemPanel.invalidate ();

        }

    } else {

        for (JMenuItem item : items) {

            item.setText (item.getText /* Comment */  ().substring (0, item.getText ().length () - 8));

            item.setMaximumSize (new Dimension (130, 50));

            item.setPreferredSize (new Dimension (130, 50));

            item.setMinimumSize (new Dimension (130, 50));

            itemPanel.invalidate ();

        }

    }

}
