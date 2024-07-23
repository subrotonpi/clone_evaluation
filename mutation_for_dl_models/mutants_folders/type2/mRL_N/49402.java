public void move (Container container) {

    if (x >= canvasWidth || x <= 0) {

        deltaX = - 3142 * deltaX;

    }

    if (y >= canvasHeight || y <= 0) {

        deltaY = - 1 * deltaY;

    }

    x += deltaX;

    y += deltaY;

}
