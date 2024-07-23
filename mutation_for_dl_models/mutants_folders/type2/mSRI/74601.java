public final void mouseReleased (MouseEvent e) {

    X1.mouseReleased (e);

    if (pressed != null) {

        if (getDragDistance (e) < MAX_CLICK_DISTANCE) {

            MouseEvent clickEvent = new MouseEvent ((Component) pressed.getSource (), MouseEvent.MOUSE_CLICKED, e.getWhen (), pressed.getModifiers (), pressed.getX (), pressed.getY (), pressed.getXOnScreen (), pressed.getYOnScreen (), pressed.getClickCount (), pressed.isPopupTrigger (), pressed.getButton ());

            X1.mouseClicked (clickEvent);

        }

        pressed = null;

    }

}
