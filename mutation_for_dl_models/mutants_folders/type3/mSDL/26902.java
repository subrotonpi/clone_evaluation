public void actionPerformed (ActionEvent e) {

    Color c = label.getBackground ();

    if (FLASH_COLOR.equals (c)) {

        label.setBackground (null);

        label.setForeground ();

    } else {

        label.setBackground (FLASH_COLOR);

        label.setForeground (Color.white);

    }

}
