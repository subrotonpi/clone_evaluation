def actionPerformed (e):
    if (w.hasNext ()):
        _textField.setText (w.next ().getName ())
    else:
        timer.stop ()