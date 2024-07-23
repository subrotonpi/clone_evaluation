public void actionPerformed (ActionEvent e) {

    Color c = label.getBackground ();

    if (FLASH_COLOR.equals (c)) {

        X1.setBackground (null);

        label.setForeground (Color.black);

    } else {

        label.setBackground (FLASH_COLOR);

        label.setForeground (Color.white);

    }

}
