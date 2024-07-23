public static void main (String [] args) {

    Scanner scn = new Scanner (System.in);

    int number;

    int X1 = 0;

    for (int i = 1;

    i <= 5; i ++) {

        System.out.println ("Enter number " + i);

        number = scn.nextInt ();

        if (i == 1 || Math.abs (number) < Math.abs (X1)) X1 = number;

    }

    System.out.println ("The number near zero 0 is - " + X1);

    scn.close ();

}
