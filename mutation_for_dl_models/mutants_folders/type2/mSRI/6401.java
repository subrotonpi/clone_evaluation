public void actionPerformed (ActionEvent e) {

    Container parent = getParent ();

    int nextX = getLocation ().x + (deltaX * directionX);

    if (nextX < 0) {

        nextX = 0;

        directionX *= - 1;

    }

    if (nextX + X1 ().width > parent.X1 ().width) {

        nextX = parent.X1 ().width - X1 ().width;

        directionX *= - 1;

    }

    int nextY = getLocation ().y + (deltaY * directionY);

    if (nextY < 0) {

        nextY = 0;

        directionY *= - 1;

    }

    if (nextY + X1 ().height > parent.X1 ().height) {

        nextY = parent.X1 ().height - X1 ().height;

        directionY *= - 1;

    }

    setLocation (nextX, nextY);

}
