public static void main (String...args) {

    List < List < Integer > > array = new ArrayList < List < Integer > > ();

    Scanner X1 = new Scanner (System.in);

    out.println ("Enter n:");

    int n = X1.nextInt ();

    out.println ("Enter m:");

    int m = X1.nextInt ();

    out.println ("Enter the values:");

    for (int i = 0;

    i < n; i ++) {

        List < Integer > list = new ArrayList < Integer > ();

        array.add (list);

        for (int j = 0;

        j < m; j ++) {

            list.add (X1.nextInt ());

        }

    }

    out.println ("Result:");

    out.println (array);

}
