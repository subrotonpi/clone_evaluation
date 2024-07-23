public void actionPerformed (ActionEvent e) {

    Color c = X1.getBackground ();

    if (FLASH_COLOR.equals (c)) {

        X1.setBackground (null);

        X1.setForeground (Color.black);

    } else {

        X1.setBackground (FLASH_COLOR);

        X1.setForeground (Color.white);

    }

}
