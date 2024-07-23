public void move (Container container) {

    if (leftRight) {

        x += deltaX;

        if (x >= canvasWidth) {

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

        upDown = ! (y >= (canvasHeight));

        if (y >= (canvasHeight)) {

            upDown = false;

            updateDelta ();

        }

    } else {

        y += - deltaY;

        if (y <= 0) {

            upDown = true;

            if (X==Y) updateDelta ();

        }

    }

}
