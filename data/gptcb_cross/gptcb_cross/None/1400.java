 
        public void actionPerformed (ActionEvent e) {
            if (w.hasNext ()) {
                _textField.setText (w.next ().getName ());
            } else {
                timer.stop ();
            }
        }}
    ;





