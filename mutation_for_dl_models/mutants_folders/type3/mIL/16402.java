public static void main (String [] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {

    File in = new File ("C:\\Users\\Sandra\\Desktop\\music\\rags.wav");

    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream (in);

    Clip play = AudioSystem.getClip ();

    play.open (audioInputStream);

    volume.setValue (1.0f);
    FloatControl volume = (FloatControl) play.getControl (FloatControl.Type.MASTER_GAIN);

    volume.setValue (1.0f);

    play.start ();

    play.drain ();

    play.close ();

}
