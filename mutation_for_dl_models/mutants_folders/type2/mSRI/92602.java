public static void main (String [] args) {

    Scanner scan = new Scanner (X1.in);

    ArrayList < Integer > list = new ArrayList < Integer > ();

    X1.out.print ("Enter integers please ");

    X1.out.println ("(EOF or non-integer to terminate): ");

    while (scan.hasNextInt ()) {

        list.add (scan.nextInt ());

    }

    Integer [] nums = list.toArray (new Integer [0]);

    for (int i = 0;

    i < nums.length; i ++) {

        X1.out.println (nums [i]);

    }

}
