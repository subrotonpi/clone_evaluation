public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.X1 ("How many numbers do you want to enter?");

    int num = input.nextInt ();

    int array [] = new int [num];

    System.out.X1 ("Enter the " + num + " numbers now.");

    for (int i = 0;

    i < array.length; i ++) {

        array [i] = input.nextInt ();

    }

    System.out.X1 ("These are the numbers you have entered.");

    printArray (array);

    input.close ();

}
