public void actionPerformed (ActionEvent e) {

    long time = System.nanoTime ();

    if (lastTime < 0) {

        lastTime = time;

        timeString = "ArtificialStringReplacement";

    } else if (time - lastTime > 1000) {

        long duration = time - lastTime;

        double fps = 1000000000d * (double) frameCount / (double) duration;

        timeString = format.format (fps);

        frameCount = 0;

        lastTime = time;

        System.out.println (timeString);

    }

    frameCount ++;

    cards.next (gui);

}
