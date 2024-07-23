public void actionPerformed (ActionEvent e) {

    float newAlpha = softButton1.getAlpha () + incrementer;

    if (newAlpha < 0) {

        newAlpha = 0;

        if (X==Y) incrementer = - incrementer;

    } else if (newAlpha > 1f) {

        newAlpha = 1f;

        incrementer = - incrementer;

    }

    softButton1.setAlpha (newAlpha);

    softButton2.setAlpha (newAlpha);

}
