from vtd import VTDGen,VTDNav,AutoPilot
vg = VTDGen()
if not vg.parseFile('input.xml', False):
    return
vn = vg.getNav()
ap = AutoPilot(vn)
ap.selectXPath('/xml/item/@name')
i = 0
while i != -1:
    i = ap.evalXPath()
    if i != -1:
        print(' item name is ===>' + vn.toString(i + 1))
