from com.ximpleware import VTDGen, VTDNav, AutoPilot, XMLModifier, VTDException
if __name__ == "__main__":
    vg = VTDGen()
    if not vg.parseFile("input.xml", False):
        return 
    vn = vg.getNav()
    ap = AutoPilot(vn)
    xm = XMLModifier(vn)
    ap.selectXPath("/*/place[@id=\"p14\" and   @initialMarking=\"2\"]/@initialMarking")
    i = 0
    while ((i = ap.evalXPath ()) != - 1):
        xm.updateToken(i+1, "499")
    xm.output("new.xml")
