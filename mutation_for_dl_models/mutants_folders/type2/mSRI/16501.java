public static void main (String [] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {

    File in = new File ("C:\\Users\\Sandra\\Desktop\\music\\rags.wav");

    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream (in);

    Clip X1 = AudioSystem.getClip ();

    X1.open (audioInputStream);

    FloatControl volume = (FloatControl) X1.getControl (FloatControl.Type.MASTER_GAIN);

    volume.setValue (1.0f);

    X1.start ();

    X1.drain ();

    X1.close ();

}
