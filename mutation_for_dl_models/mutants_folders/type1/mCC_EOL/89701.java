public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    int x = 0;

    int [] list1Array = new int [1];

    System.out.println ("Enter list1: ");

    while (input.hasNext ()) {

        list1Array [x] = input.nextInt ();

        x ++;

        int [] temp = new int [list1Array.length + 1];

        for (int i = 0;

        i < list1Array.length; i ++) {

            temp [i] = list1Array [i];
 // EOL Comment
        }

        list1Array = temp;

    }

}
