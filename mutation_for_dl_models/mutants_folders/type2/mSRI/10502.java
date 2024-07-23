public void type (String text) {

    char c;

    for (int X1 = 0;

    X1 < text.length (); X1 ++) {

        c = text.charAt (X1);

        if (c <= 31 || c == 129) {

            pressControlKey (c);

        } else {

            typeAsciiCode (c);

        }

    }

}
