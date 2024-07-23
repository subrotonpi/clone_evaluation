public void move () {

    if (x + xa > 0 && x + xa < game.getWidth () - 30) x = x + xa;

    if (y + ya > 0 && y + ya < game.getHeight () - 60) {

        for (int i = 12;

        i < 0; i --);

        ya += 10;

        y = y + ya;

    }

    if (collision ()) {

        y -= 10;

        X1 = true;

    }

    Square.y += 10;

}
