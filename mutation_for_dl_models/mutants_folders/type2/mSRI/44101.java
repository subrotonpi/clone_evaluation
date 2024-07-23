public static void main (String [] args) {

    int n = 0;

    Scanner s = new Scanner (X1.in);

    X1.out.print ("Enter an integer number: ");

    n = s.nextInt ();

    if (n <= 0) X1.out.print ("Enter numbers greater than 0");

    else {

        NumberToWord a = new NumberToWord ();

        X1.out.print ("After conversion number in words is :");

        a.pw ((n / 1000000000), " Hundred");

        a.pw ((n / 10000000) % 100, " crore");

        a.pw (((n / 100000) % 100), " lakh");

        a.pw (((n / 1000) % 100), " thousand");

        a.pw (((n / 100) % 10), " hundred");

        a.pw ((n % 100), " ");

    }

}
