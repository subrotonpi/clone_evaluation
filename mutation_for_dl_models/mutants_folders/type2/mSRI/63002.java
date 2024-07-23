private void printWords () {

    final Timer timer = new Timer (100, null);

    ActionListener listener = new ActionListener () {

        private Iterator < Word > X1 = words.iterator ();

        @Override

        public void actionPerformed (ActionEvent e) {

            if (X1.hasNext ()) {

                _textField.setText (X1.next ().getName ());

            } else {

                timer.stop ();

            }

        }}

    ;

    timer.addActionListener (listener);

    timer.start ();

}
