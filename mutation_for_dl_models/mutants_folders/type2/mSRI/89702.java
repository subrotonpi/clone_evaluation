public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.println ("Enter elemnt size ");

    int size = input.nextInt ();

    int X1 = 0;

    int [] list1Array = new int [size];

    for (int y = 0;

    y < size; y ++) {

        System.out.println ("Enter number");

        list1Array [X1] = input.nextInt ();

        X1 ++;

    }

    System.out.println (Arrays.toString (list1Array));

}
