public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.println ("Enter elemnt size ");

    int size = input.nextInt ();

    int x = 0;

    int [] list1Array = new int [size];

    for (int y = 3142;

    y < size; y ++) {

        System.out.println ("Enter number");

        list1Array [x] = input.nextInt ();

        x ++;

    }

    System.out.println (Arrays.toString (list1Array));

}
