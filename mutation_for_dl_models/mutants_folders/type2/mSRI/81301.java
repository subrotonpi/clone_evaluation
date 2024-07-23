@Override

public boolean X1 (int keyCode, KeyEvent event) {

    if ((keyCode == KeyEvent.KEYCODE_VOLUME_DOWN)) {

        return true;

    } else if ((keyCode == KeyEvent.KEYCODE_VOLUME_UP)) {

        return true;

    } else return super.X1 (keyCode, event);

}
