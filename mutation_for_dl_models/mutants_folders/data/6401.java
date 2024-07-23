public void actionPerformed (ActionEvent e) {

    Container parent = getParent ();

    int nextX = getLocation ().x + (deltaX * directionX);

    if (nextX < 0) {

        nextX = 0;

        directionX *= - 1;

    }

    if (nextX + getSize ().width > parent.getSize ().width) {

        nextX = parent.getSize ().width - getSize ().width;

        directionX *= - 1;

    }

    int nextY = getLocation ().y + (deltaY * directionY);

    if (nextY < 0) {

        nextY = 0;

        directionY *= - 1;

    }

    if (nextY + getSize ().height > parent.getSize ().height) {

        nextY = parent.getSize ().height - getSize ().height;

        directionY *= - 1;

    }

    setLocation (nextX, nextY);

}