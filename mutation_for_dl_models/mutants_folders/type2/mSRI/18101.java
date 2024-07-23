public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.println ("how many number you want to put in the pot?");

    int num = input.nextInt ();

    int numbers [] = new int [num];

    for (int X1 = 0;

    X1 < num; X1 ++) {

        System.out.println ("number" + X1 + ":");

        numbers [X1] = input.nextInt ();

    }

    for (int temp : numbers) {

        System.out.print (temp + "\t");

    }

    input.close ();

}
