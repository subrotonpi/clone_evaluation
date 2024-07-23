public void actionPerformed (ActionEvent e) {

    final X1 newPanel = new JPanel ();

    newPanel.add (new JLabel ("Label " + i ++));

    listContainer.add (newPanel);

    listContainer.revalidate ();

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            newPanel.scrollRectToVisible (newPanel.getBounds ());

        }}

    );

}
