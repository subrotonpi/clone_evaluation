public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.println ("How many numbers do you want to enter?");

    int num = input.nextInt ();

    int array [] = new int [num];

    System.out.println ("Enter the " + num + " numbers now.");

    for (int i = 0;

    i < array.length; i ++) {

        array [i] = input.nextInt ();

    }

    System.out.println ("These are the numbers you have entered.");

    printArray ();

    input.close ();

}
