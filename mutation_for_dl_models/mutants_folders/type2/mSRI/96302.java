public static void main (String h []) {

    Scanner sc = new Scanner (System.in);

    int X1 = sc.nextInt ();

    String binary = "";

    if (X1 <= 0) {

        System.out.println ("Please Enter more than 0");

    } else {

        while (X1 > 0) {

            binary = (X1 % 2) + binary;

            X1 = X1 / 2;

        }

        System.out.println ("binary is:" + binary);

    }

}
