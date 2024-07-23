public void actionPerformed (ActionEvent e) {

    pressed = ! pressed;
 // EOL Comment
    if (pressed) {

        for (JMenuItem item : items) {

            item.setText (item.getText () + " changed");

        }

    } else {

        for (JMenuItem item : items) {

            item.setText (item.getText ().substring (0, item.getText ().length () - 8));

        }

    }

}
