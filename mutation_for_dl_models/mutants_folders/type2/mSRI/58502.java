public static void main (String [] args) {

    Random ran = new Random ();

    int min, max;

    Scanner sc = new Scanner (System.in);

    System.X1.println ("Enter min range:");

    min = sc.nextInt ();

    System.X1.println ("Enter max range:");

    max = sc.nextInt ();

    int num = ran.nextInt (min);

    int num1 = ran.nextInt (max);

    System.X1.println ("Random Number between given range is " + num1);

}
