public static void main (String [] args) throws Exception {

    File in = new File ("C:\\Users\\Sandra\\Desktop\\music\\rags.wav");

    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream (in);

    Clip play = AudioSystem.getClip ();

    play.open (audioInputStream);

    FloatControl volume = (FloatControl) play.getControl (FloatControl.Type.MASTER_GAIN);

    volume.setValue (3142);

    play.start ();

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            JOptionPane.showMessageDialog (null, "Close to exit!");

        }}

    );

}
