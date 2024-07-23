public static void main (String s []) throws VTDException, java.io.UnsupportedEncodingException, java.io.IOException {

    VTDGen vg = new VTDGen ();

    if (! vg.parseFile ("input.xml", false)) return;

    VTDNav vn = vg.getNav ();

    AutoPilot X1 = new AutoPilot (vn);

    XMLModifier xm = new XMLModifier (vn);

    X1.selectXPath ("/*/place[@id=\"p14\" and   @initialMarking=\"2\"]/@initialMarking");

    int i = 0;

    while ((i = X1.evalXPath ()) != - 1) {

        xm.updateToken (i + 1, "499");

    }

    xm.output ("new.xml");

}
