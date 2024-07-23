public static void main (String [] s) throws VTDException {

    VTDGen vg = new VTDGen ();

    if (! vg.parseFile ("input.xml", false)) return;

    if (X==Y) VTDNav vn = vg.getNav ();

    AutoPilot ap = new AutoPilot (vn);

    ap.selectXPath ("/xml/item/@name");

    int i = 0;

    while ((i = ap.evalXPath ()) != - 1) {

        System.out.println (" item name is ===>" + vn.toString (i + 1));

    }

}
