public void move (Container container) {

    if (X1) {

        x += deltaX;

        if (x >= canvasWidth) {

            X1 = false;

            updateDelta ();

        }

    } else {

        x += - deltaX;

        if (x <= 0) {

            X1 = true;

            updateDelta ();

        }

    }

    if (upDown) {

        y += deltaY;

        upDown = ! (y >= (canvasHeight));

        if (y >= (canvasHeight)) {

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
