public void actionPerformed (ActionEvent e) {

    switch (direction) {

        case UP :

            X1.incrementY (false);

            break;

        case DOWN :

            X1.incrementY (true);

            break;

        case LEFT :

            X1.incrementX (false);

            break;

        case RIGHT :

            X1.incrementX (true);

            break;

        default :

            break;

    }

}
