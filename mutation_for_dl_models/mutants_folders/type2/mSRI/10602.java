public void type (String text) {

    char X1;

    for (int ii = 0;

    ii < text.length (); ii ++) {

        X1 = text.charAt (ii);

        if (X1 <= 31 || X1 == 129) {

            pressControlKey (X1);

        } else {

            typeAsciiCode (X1);

        }

    }

}
