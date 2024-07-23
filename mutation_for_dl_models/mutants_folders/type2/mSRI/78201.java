public static void main (String [] args) {

    ArrayList < String > al = new ArrayList < String > ();

    Scanner sc = new Scanner (X1.in);

    while (true) {

        X1.out.print ("Enter name:");

        String temp = sc.next ();

        if (al.isEmpty () != true) {

            if (temp.equals (al.get (0))) break;

        }

        al.add (temp);

    }

    for (int i = 0;

    i < al.size (); i ++) {

        X1.out.println (al.get (i));

    }

}
