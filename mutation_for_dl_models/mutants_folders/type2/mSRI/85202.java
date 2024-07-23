public static void main (String [] s) throws VTDException {

    VTDGen vg = new VTDGen ();

    if (! vg.parseFile ("input.xml", false)) return;

    VTDNav X1 = vg.getNav ();

    AutoPilot ap = new AutoPilot (X1);

    ap.selectXPath ("/xml/item/@name");

    int i = 0;

    while ((i = ap.evalXPath ()) != - 1) {

        System.out.println (" item name is ===>" + X1.toString (i + 1));

    }

}
