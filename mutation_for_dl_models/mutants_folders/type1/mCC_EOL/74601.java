public final void mouseReleased (MouseEvent e) {

    target.mouseReleased (e);
 // EOL Comment
    if (pressed != null) {

        if (getDragDistance (e) < MAX_CLICK_DISTANCE) {

            MouseEvent clickEvent = new MouseEvent ((Component) pressed.getSource (), MouseEvent.MOUSE_CLICKED, e.getWhen (), pressed.getModifiers (), pressed.getX (), pressed.getY (), pressed.getXOnScreen (), pressed.getYOnScreen (), pressed.getClickCount (), pressed.isPopupTrigger (), pressed.getButton ());

            target.mouseClicked (clickEvent);

        }

        pressed = null;

    }

}
