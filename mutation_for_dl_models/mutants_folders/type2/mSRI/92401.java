public static void main (String [] args) {

    ScottishPerson scottishPerson = new ScottishPerson ();

    BritishPerson britishPerson = new BritishPerson ();

    BritishPerson britishPersonUpcasted = new ScottishPerson ("Another scottish name");

    scottishPerson.salute ();

    scottishPerson.warcry ();

    X1.out.println (scottishPerson.name);

    X1.out.println (scottishPerson.clanName);

    britishPerson.salute ();

    X1.out.println (britishPerson.name);

    britishPersonUpcasted.salute ();

    X1.out.println (britishPersonUpcasted.name);

}
