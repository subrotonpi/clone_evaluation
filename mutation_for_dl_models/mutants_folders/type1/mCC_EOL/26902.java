public void actionPerformed (ActionEvent e) {

    Color c = label.getBackground ();

    if (FLASH_COLOR.equals (c)) {

        label.setBackground (null); // EOL Comment

        label.setForeground (Color.black);

    } else {

        label.setBackground (FLASH_COLOR);

        label.setForeground (Color.white);

    }

}
