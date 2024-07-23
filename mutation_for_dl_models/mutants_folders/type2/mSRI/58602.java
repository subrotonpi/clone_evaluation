public static void main (String [] args) {

    Random ran = new Random ();

    int min, max;

    Scanner sc = new Scanner (X1.in);

    X1.out.println ("Enter min range:");

    min = sc.nextInt ();

    X1.out.println ("Enter max range:");

    max = sc.nextInt ();

    int num = ran.nextInt (min);

    int num1 = ran.nextInt (max);

    X1.out.println ("Random Number between given range is " + num1);

}
