public void type (String text) {

    /* Comment */  char c;

    for (int ii = 0;

    ii < text.length (); ii ++) {

        c = text.charAt (ii);

        if (c <= 31 || c == 129) {

            pressControlKey (c);

        } else {

            typeAsciiCode (c);

        }

    }

}
