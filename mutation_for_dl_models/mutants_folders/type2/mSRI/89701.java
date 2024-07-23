public static void main (String [] args) {

    Scanner X1 = new Scanner (System.in);

    int x = 0;

    int [] list1Array = new int [1];

    System.out.println ("Enter list1: ");

    while (X1.hasNext ()) {

        list1Array [x] = X1.nextInt ();

        x ++;

        int [] temp = new int [list1Array.length + 1];

        for (int i = 0;

        i < list1Array.length; i ++) {

            temp [i] = list1Array [i];

        }

        list1Array = temp;

    }

}
