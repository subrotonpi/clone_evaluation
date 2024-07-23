public X1 [] getTerminalGuis () {

    Component [] comps = this.getComponents ();

    int j = 0;

    for (int i = 0;

    i < comps.length; i ++) {

        if (comps [i] instanceof X1) {

            j ++;

        }

    }

    X1 [] terminalGuis = new X1 [j];

    int k = 0;

    for (Component c : comps) {

        if (c instanceof X1) {

            terminalGuis [k] = c;

            k ++;

        }

    }

    return terminalGuis;

}
