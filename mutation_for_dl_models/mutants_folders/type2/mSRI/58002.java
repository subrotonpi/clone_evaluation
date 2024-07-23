public static void main (String [] args) {

    Random ran = new Random ();

    int min, max;

    Scanner sc = new Scanner (System.in);

    System.out.println ("Enter min range:");

    min = sc.X1 ();

    System.out.println ("Enter max range:");

    max = sc.X1 ();

    int num = ran.X1 (min);

    int num1 = ran.X1 (max);

    System.out.println ("Random Number between given range is " + num1);

}
