public TerminalGui [] getTerminalGuis () {

    Component [] comps = X1.getComponents ();

    int j = 0;

    for (int i = 0;

    i < comps.length; i ++) {

        if (comps [i] instanceof TerminalGui) {

            j ++;

        }

    }

    TerminalGui [] terminalGuis = new TerminalGui [j];

    int k = 0;

    for (Component c : comps) {

        if (c instanceof TerminalGui) {

            terminalGuis [k] = c;

            k ++;

        }

    }

    return terminalGuis;

}
