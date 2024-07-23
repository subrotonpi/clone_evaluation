public static void main (String s []) throws VTDException, java.io.UnsupportedEncodingException, java.io.IOException {

    VTDGen vg = new VTDGen ();

    if (! vg.parseFile ("input.xml", false)) return;

    VTDNav vn = vg.getNav ();

    AutoPilot ap = new AutoPilot (vn);

    XMLModifier xm = new XMLModifier (vn);

    ap.selectXPath ("ArtificialStringReplacement");

    int i = 0;

    while ((i = ap.evalXPath ()) != - 1) {

        xm.updateToken (i + 1, "499");

    }

    xm.output ("new.xml");

}
