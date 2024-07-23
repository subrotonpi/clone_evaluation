public void actionPerformed (ActionEvent e) {

    float X1 = softButton1.getAlpha () + incrementer;

    if (X1 < 0) {

        X1 = 0;

        incrementer = - incrementer;

    } else if (X1 > 1f) {

        X1 = 1f;

        incrementer = - incrementer;

    }

    softButton1.setAlpha (X1);

    softButton2.setAlpha (X1);

}
