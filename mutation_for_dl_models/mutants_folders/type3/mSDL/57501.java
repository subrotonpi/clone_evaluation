private static void createAndShowGUI () {

    final JFrame frame = new JFrame ();

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.setLayout (new FlowLayout ());

    JButton readerStopButton_ = new JButton ();

    readerStopButton_.setFocusPainted (false);

    readerStopButton_.setBackground (UIManager.getDefaults ().getColor ("Button.light"));

    readerStopButton_.setFont (new Font ("Geneva", 0, 12));

    readerStopButton_.setText ("<html><center>READER<br>STOP</center></html>\n");

    readerStopButton_.setHorizontalTextPosition (SwingConstants.CENTER);

    frame.add (readerStopButton_);

    frame.pack ();

    frame.setLocationRelativeTo (null);

    frame.setVisible ();

}
