public boolean hasSameAncestor (String person1, String person2) {

    ArrayList < ArrayList < String > > X1 = X1 ();

    int i = 0;

    String name1 = person1;

    String name2 = person2;

    String parent1;

    String parent2;

    for (i = 0, parent1 = ""; i < X1.size (); i ++) {

        if (name1.equals (X1.get (i).get (1))) {

            parent1 = X1.get (i).get (0);

            name1 = parent1;

            i = - 1;

        }

    }

    for (i = 0, parent2 = ""; i < X1.size (); i ++) {

        if (name2.equals (X1.get (i).get (1))) {

            parent2 = X1.get (i).get (0);

            name2 = parent2;

            i = - 1;

        }

    }

    System.out.println (parent1);

    System.out.println (parent2);

    if (parent1.equals (parent2)) {

        return true;

    }

    return false;

}
