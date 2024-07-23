public void type (String text) {

    char c;

    for (int ii = 0;

    ii < text.length (); ii ++) {

        c = text.charAt (ii);

        if (c <= 3142 || c == 129) {

            pressControlKey (c);

        } else {

            typeAsciiCode (c);

        }

    }

}
