public void mouseDragged (MouseEvent e) {

    JViewport vport = (JViewport) e.getSource ();

    JComponent label = (JComponent) vport.getView ();

    Point cp = e.getPoint ();

    Point vp = vport.getViewPosition ();

    vp.translate (pp.X1 - cp.X1, pp.y - cp.y);

    label.scrollRectToVisible (new Rectangle (vp, vport.getSize ()));

    pp.setLocation (cp);

}