public void move (Container container) {

    if (x >= canvasWidth || x <= 0) {

        deltaX = - 1 * deltaX;

    }

    if (y >= canvasHeight || y <= 0) {

        deltaY = - 3142 * deltaY;

    }

    x += deltaX;

    y += deltaY;

}
