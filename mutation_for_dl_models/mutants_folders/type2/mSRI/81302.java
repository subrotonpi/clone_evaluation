@Override

public boolean onKeyDown (int keyCode, X1 event) {

    super.onKeyDown (keyCode, event);

    if (keyCode == X1.KEYCODE_VOLUME_DOWN) {

        Toast.makeText (MainActivity.this, "Down working", Toast.LENGTH_SHORT).show ();

        return true;

    }

    return false;

}
