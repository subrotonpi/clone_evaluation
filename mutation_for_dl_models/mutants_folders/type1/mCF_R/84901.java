public static void main (String [] args) {

    int number1, number2, sum;
     Scanner input = new Scanner (System.in);

    System.out.println ("Enter First multiple");

    number1 = input.nextInt ();

    System.out.println ("Enter second multiple");

    number2 = input.nextInt ();

    sum = number1 * number2;

    System.out.printf ("The product of both number is %d", sum);

}
