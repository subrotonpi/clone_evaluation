public static void main (String [] args) {

    char cont = 'E';

    do {

        temp1 = getTemp ();

        scale1 = scaleOne (); // EOL Comment

        scale2 = toScale ();

        System.out.print ("Your final temp is: " + convert () + ' ' + scale2);

    } while (cont == 'N');

}
