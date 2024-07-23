public TerminalGui [] getTerminalGuis () {

    Components comps [] = getComponents ();

    List < TerminalGui > X1 = new ArrayList < TerminalGui > ();

    if (comps == null) return null;

    for (Component c : comps) {

        if (c instanceof TerminalGui) {

            X1.add (c);

        }

    }

    return X1.toArray (new TerminalGui [X1.size ()]);

}
