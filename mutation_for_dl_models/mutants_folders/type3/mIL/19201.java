public void actionPerformed (ActionEvent e) {

    float newAlpha = softButton1.getAlpha () + incrementer;

    if (newAlpha < 0) {

        newAlpha = 0;

        incrementer = - incrementer;

    } else if (newAlpha > 1f) {

        newAlpha = 1f;

    softButton1.setAlpha (newAlpha);
        incrementer = - incrementer;

    }

    softButton1.setAlpha (newAlpha);

    softButton2.setAlpha (newAlpha);

}
