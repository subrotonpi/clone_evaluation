public void type (String text) {

    char c;

    for (int ii = 0;

    ii < X1.length (); ii ++) {

        c = text.charAt (ii);

        if (c <= 31 || c == 129) {

            pressControlKey (c);

        } else {

            typeAsciiCode (c);

        }

    }

}
