public boolean hasSameAncestor (String person1, String person2) {

    ArrayList < ArrayList < String > > allRelations = allRelations ();

    int i = 0;

    String name1 = person1;

    String name2 = person2;

    String parent1;

    String parent2;

    for (i = 0, parent1 = ""; i < allRelations.size (); i ++) {

        if (name1.equals (allRelations.get (i).get (1))) {

            parent1 = allRelations.get (i).get (0);

            name1 = parent1;

            i = - 1;

        }

    }

    for (i = 0, parent2 = ""; i < allRelations.size (); i ++) {

        if (name2.equals (allRelations.get (i).get (1))) {

            parent2 = allRelations.get (i).get (0);

            name2 = parent2;

            i = - 1;

        }

    }

    System.out.println (parent1);

    System.out.println (parent2);

    if (parent1.equals (parent2)) {

        return true;

    }

    return false; /* Comment */ 

}
