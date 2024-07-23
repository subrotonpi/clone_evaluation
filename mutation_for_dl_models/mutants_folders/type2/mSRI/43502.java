public static void main (String [] args) {

    int X1 = 0;

    Scanner s = new Scanner (System.in);

    System.out.print ("Enter an integer number: ");

    X1 = s.nextInt ();

    if (X1 <= 0) System.out.print ("Enter numbers greater than 0");

    else {

        NumberToWord a = new NumberToWord ();

        System.out.print ("After conversion number in words is :");

        a.pw ((X1 / 1000000000), " Hundred");

        a.pw ((X1 / 10000000) % 100, " crore");

        a.pw (((X1 / 100000) % 100), " lakh");

        a.pw (((X1 / 1000) % 100), " thousand");

        a.pw (((X1 / 100) % 10), " hundred");

        a.pw ((X1 % 100), " ");

    }

}
