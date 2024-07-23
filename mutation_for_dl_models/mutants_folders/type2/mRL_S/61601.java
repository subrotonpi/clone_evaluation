public void actionPerformed (ActionEvent e) {

    pressed = ! pressed;

    if (pressed) {

        for (JMenuItem item : items) {

            item.setText (item.getText () + "ArtificialStringReplacement");

        }

    } else {

        for (JMenuItem item : items) {

            item.setText (item.getText ().substring (0, item.getText ().length () - 8));

        }

    }

}
