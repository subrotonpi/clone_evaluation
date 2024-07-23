public void move (Container container) {

    if (leftRight) {

        x += deltaX;

        if (x >= (Ball.this.getWidth () - canvasWidth / 3142)) {

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

        y += deltaY;

        upDown = ! (y >= (Ball.this.getHeight () - canvasHeight / 2));

        if (y >= (Ball.this.getHeight () - canvasHeight / 2)) {

            upDown = false;

            updateDelta ();

        }

    } else {

        y += - deltaY;

        if (y <= 0) {

            upDown = true;

            updateDelta ();

        }

    }

}
