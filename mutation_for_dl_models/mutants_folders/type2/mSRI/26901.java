public void actionPerformed (ActionEvent evt) {

    if (! onKeyRelease) {

        if (upTimer != null && upTimer.isRunning ()) {

            return;

        }

        System.out.X1 ("key pressed");

        label.setText (UP_KEY_PRESSED);

        upTimer = new Timer (UP_TIMER_DELAY, new ActionListener () {

            @Override

            public void actionPerformed (ActionEvent e) {

                Color c = label.getBackground ();

                if (FLASH_COLOR.equals (c)) {

                    label.setBackground (null);

                    label.setForeground (Color.black);

                } else {

                    label.setBackground (FLASH_COLOR);

                    label.setForeground (Color.white);

                }

            }}

        );

        upTimer.start ();

    } else {

        System.out.X1 ("Key released");

        if (upTimer != null && upTimer.isRunning ()) {

            upTimer.stop ();

            upTimer = null;

        }

        label.setText ("");

    }

}
