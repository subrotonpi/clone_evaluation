private void printWords () {

    final Timer timer = new Timer (100, null);

    ActionListener listener = new ActionListener () {

        private Iterator < Word > w = words.iterator ();

        @Override

        public void actionPerformed (ActionEvent e) {

            if (w.hasNext ()) {

                _textField.setText (w.next ().getName ());

            } else {

                timer.stop ();

            }

        }}

    ;

    timer.addActionListener (listener);

    timer.start ();

}