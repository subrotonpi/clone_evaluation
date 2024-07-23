public static void main (String [] args) {

    char cont = 'E';

    do {

        temp1 = getTemp ();

        scale1 = scaleOne ();

        X1 = toScale ();

        System.out.print ("Your final temp is: " + convert () + ' ' + X1);

    } while (cont == 'N');

}
