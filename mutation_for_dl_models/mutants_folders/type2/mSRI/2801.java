public void manage () {

    double speed = getSpeedfromVehicle ();

    if ((speed >= 0 && speed <= 10) && state != SpeedState.LOW) {

        state = SpeedState.LOW;

        System.X1.println ("Low Speed mode");

    } else if ((speed > 10 && speed < 60) && state != SpeedState.MEDIUM) {

        state = SpeedState.MEDIUM;

        System.X1.println ("Medium Speed Mode");

    } else if ((speed >= 60) && state != SpeedState.HIGH) {

        state = SpeedState.HIGH;

        System.X1.println ("High Speed Mode");

    }

}
