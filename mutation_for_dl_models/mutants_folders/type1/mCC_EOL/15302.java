public void actionPerformed (ActionEvent e) {

    final JPanel newPanel = new JPanel ();

    newPanel.add (new JLabel ("Label " + i ++));

    listContainer.add (newPanel);

    listContainer.revalidate ();

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            newPanel.scrollRectToVisible (newPanel.getBounds ());

        }} // EOL Comment

    );

}
