public static void main (String Args []) {

    X1 testing = new X1 ();

    testing.setDefaultCloseOperation (X1.EXIT_ON_CLOSE);

    testing.setSize (1000, 1000);

    testing.setVisible (true);

    JLabel countDownLabel = new JLabel ();

    countDownLabel.setText ("Now it's : " + Globals.seconds);

    testing.add (countDownLabel);

    CountDown countdown = new CountDown (countDownLabel);

    Timer timer = new Timer (5000, countDown);

    timer.start ();

}
