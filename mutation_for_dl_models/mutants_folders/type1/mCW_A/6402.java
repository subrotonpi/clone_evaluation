public void actionPerformed (ActionEvent e) {

    switch (direction) {

        case UP :

            draw.incrementY (false);

            break;

        case DOWN :

            draw.incrementY (true);

            break;

        case LEFT :

            draw.incrementX (false);

            break;

        case RIGHT :

             draw.incrementX (true);

            break;

        default :

            break;

    }

}
