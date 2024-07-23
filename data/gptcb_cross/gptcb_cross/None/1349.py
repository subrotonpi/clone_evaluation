def main(s):
    vg = VTDGen()
    ap = AutoPilot()
    ap.selectXPath("//part/*[text()]")
    if not vg.parseFile("d://xml/soap.xml", False):
        print("invalid xml")
        exit(0)

    vn = vg.getNav()
    ap.bind(vn)
    i = 0
    while i != -1:
        i = ap.evalXPath()
        if i != -1:
            print(" %s = %s" % (vn.toRawString(i), vn.toNormalizedString(vn.getText())))