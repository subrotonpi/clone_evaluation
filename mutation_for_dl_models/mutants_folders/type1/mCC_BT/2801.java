public void manage () {

    double speed = getSpeedfromVehicle ();

    if ((speed >= 0 && speed <= 10) && state != SpeedState.LOW) {

        state = SpeedState.LOW;

        System.out.println ("Low Speed mode");

    } else /* Comment */  if ((speed > 10 && speed < 60) && state != SpeedState.MEDIUM) {

        state = SpeedState.MEDIUM;

        System.out.println ("Medium Speed Mode");

    } else if ((speed >= 60) && state != SpeedState.HIGH) {

        state = SpeedState.HIGH;

        System.out.println ("High Speed Mode");

    }

}
