def onKeyDown (self, keyCode, event):
  super().onKeyDown (keyCode, event)
  if keyCode == KeyEvent.KEYCODE_VOLUME_DOWN:
    Toast.makeText(MainActivity.this, "Down working", Toast.LENGTH_SHORT).show()
    return True
  return False