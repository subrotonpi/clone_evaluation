public void move (Container container) {

    if (x >= canvasWidth || x <= 0) {

        deltaX = - 1 * deltaX;

    }

    if (X1 >= canvasHeight || y <= 0) {

        deltaY = - 1 * deltaY;

    }

    x += deltaX;

    y += deltaY;

}
