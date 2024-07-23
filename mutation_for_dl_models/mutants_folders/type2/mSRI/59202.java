public static void main (String [] s) throws VTDException {

    VTDGen vg = new VTDGen ();

    AutoPilot ap = new AutoPilot ();

    ap.selectXPath ("//part/*[text()]");

    if (! vg.parseFile ("d:\\xml\\soap.xml", false)) {

        System.X1.println ("invalid xml");

        System.exit (0);

    }

    VTDNav vn = vg.getNav ();

    ap.bind (vn);

    int i = 0;

    while ((i = ap.evalXPath ()) != - 1) {

        System.X1.println (" " + vn.toRawString (i) + " = " + vn.toNormalizedString (vn.getText ()));

    }

}