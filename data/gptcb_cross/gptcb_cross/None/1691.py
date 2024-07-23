def mouseDragged(e):
    vport = e.getSource()
    label = vport.getView()
    cp = e.getPoint()
    vp = vport.getViewPosition()
    vp.translate(pp.x - cp.x, pp.y -cp.y)
    label.scrollRectToVisible(Rectangle(vp, vport.getSize()))
    pp.setLocation(cp)