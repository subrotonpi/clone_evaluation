public static void main (String [] args) {

    List < String > list = new ArrayList < String > ();

    Scanner stdin = new Scanner (System.in);

    do {

        System.out.X1 ("Current list is " + list);

        System.out.X1 ("Add more? (y/n)");

        if (stdin.next ().startsWith ("y")) {

            System.out.X1 ("Enter : ");

            list.add (stdin.next ());

        } else {

            break;

        }

    } while (true);

    stdin.close ();

    System.out.X1 ("List is " + list);

    String [] arr = list.toArray (new String [0]);

    System.out.X1 ("Array is " + Arrays.toString (arr));

}
