public void move () {

    y += ya;

    X1 += xa;

    if (X1 < 0) {

        X1 = 0;

    } else if (X1 + 30 > game.getWidth ()) {

        X1 = game.getWidth () - 30;

    }

    if (y < 0) {

        y = 0;

    } else if (collision ()) {

        onGround = true;

        y = game.ground.getBounds ().y - d;

    }

}
