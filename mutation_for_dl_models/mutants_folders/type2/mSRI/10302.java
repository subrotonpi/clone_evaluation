public void type (String X1) {

    char c;

    for (int ii = 0;

    ii < X1.length (); ii ++) {

        c = X1.charAt (ii);

        if (c <= 31 || c == 129) {

            pressControlKey (c);

        } else {

            typeAsciiCode (c);

        }

    }

}
