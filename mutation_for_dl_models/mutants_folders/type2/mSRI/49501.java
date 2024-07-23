public void move (Container container) {

    if (leftRight) {

        x += deltaX;

        if (x >= (Ball.this.getWidth () - canvasWidth / 2)) {

            leftRight = false;

            updateDelta ();

        }

    } else {

        x += - deltaX;

        if (x <= 0) {

            leftRight = true;

            updateDelta ();

        }

    }

    if (upDown) {

        X1 += deltaY;

        upDown = ! (X1 >= (Ball.this.getHeight () - canvasHeight / 2));

        if (X1 >= (Ball.this.getHeight () - canvasHeight / 2)) {

            upDown = false;

            updateDelta ();

        }

    } else {

        X1 += - deltaY;

        if (X1 <= 0) {

            upDown = true;

            updateDelta ();

        }

    }

}
