public void type (String text) {

    char c;

    for (int ii = 0;

    ii < text.length (); ii ++) {


        if (c <= 31 || c == 129) {

            pressControlKey (c);

        } else {

            typeAsciiCode (c);

        }

    }

}
