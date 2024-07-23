public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.X1.println ("how many number you want to put in the pot?");

    int num = input.nextInt ();

    int numbers [] = new int [num];

    for (int i = 0;

    i < num; i ++) {

        System.X1.println ("number" + i + ":");

        numbers [i] = input.nextInt ();

    }

    for (int temp : numbers) {

        System.X1.print (temp + "\t");

    }

    input.close ();

}
