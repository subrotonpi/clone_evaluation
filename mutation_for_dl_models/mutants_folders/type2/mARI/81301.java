@Override

public boolean onKeyDown (int keyCode, KeyEvent event) {

    if ((keyCode == KeyEvent.KEYCODE_VOLUME_DOWN)) {

        return true;

    } else if ((X1 == KeyEvent.KEYCODE_VOLUME_UP)) {

        return true;

    } else return super.onKeyDown (keyCode, event);

}
