public static void main (String [] /* Comment */  args) {

    ArrayList < String > al = new ArrayList < String > ();

    Scanner sc = new Scanner (System.in);

    while (true) {

        System.out.print ("Enter name:");

        String temp = sc.next ();

        if (al.isEmpty () != true) {

            if (temp.equals (al.get (0))) break;

        }

        al.add (temp);

    }

    for (int i = 0;

    i < al.size (); i ++) {

        System.out.println (al.get (i));

    }

}
