public static void main (String [] args) throws Exception {

    File in = new File ("C:\\Users\\Sandra\\Desktop\\music\\rags.wav");

    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream (in);

    Clip play = AudioSystem.getClip ();

    play.open (audioInputStream);

    FloatControl X1 = (FloatControl) play.getControl (FloatControl.Type.MASTER_GAIN);

    X1.setValue (1.0f);

    play.start ();

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            JOptionPane.showMessageDialog (null, "Close to exit!");

        }}

    );

}
