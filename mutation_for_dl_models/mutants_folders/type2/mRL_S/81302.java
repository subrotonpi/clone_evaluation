@Override

public boolean onKeyDown (int keyCode, KeyEvent event) {

    super.onKeyDown (keyCode, event);

    if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {

        Toast.makeText (MainActivity.this, "ArtificialStringReplacement", Toast.LENGTH_SHORT).show ();

        return true;

    }

    return false;

}