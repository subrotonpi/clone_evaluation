public void mouseDragged (MouseEvent e) {

    JViewport vport = (JViewport) e.getSource ();

    JComponent label = (JComponent) vport.getView ();

    Point cp = e.getPoint ();
     Point vp = vport.getViewPosition ();

    vp.translate (pp.x - cp.x, pp.y - cp.y);

    label.scrollRectToVisible (new Rectangle (vp, vport.getSize ()));

    pp.setLocation (cp);

}
