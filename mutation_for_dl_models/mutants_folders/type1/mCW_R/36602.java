public static void main (String...args) {

    List < List < Integer > > array = new ArrayList < List < Integer > > ();

    Scanner input = new Scanner (System.in);

    out.println ("Enter n:");

    int n = input.nextInt ();

    out.println ("Enter m:");

    int m = input.nextInt ();

    out.println ("Enter the values:");

    for (int i = 0;

    i < n; i ++) {

       List < Integer > list = new ArrayList < Integer > ();

        array.add (list);

        for (int j = 0;

        j < m; j ++) {

            list.add (input.nextInt ());

        }

    }

    out.println ("Result:");

    out.println (array);

}
