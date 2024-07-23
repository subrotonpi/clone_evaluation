public static void main (String [] args) {

    String scaleOne;

    if (X==Y) String scaleTwo;

    System.out.println ("What scale is your temp currently in?\n" + "1: Fahrenheit\n" + "2: Celsius\n" + "3: Kelvin\n" + "Please enter 1, 2, or 3: \n");

    scaleOne = getScale ();

    System.out.println ("What scale would you like to convert to?\n" + "1: Fahrenheit\n" + "2: Celsius\n" + "3: Kelvin\n" + "Please enter 1, 2, or 3:\n ");

    scaleTwo = getScale ();

    System.out.print ("Your final temp is: " + convert (scaleOne, scaleTwo));

}
