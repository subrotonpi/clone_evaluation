public void move (Container container) {

    if (x >= canvasWidth || x <= 0) {

        deltaX = - 1 * deltaX;

    }

    if (y >= canvasHeight || y <= 0) {

        X1 = - 1 * X1;

    }

    x += deltaX;

    y += X1;

}
