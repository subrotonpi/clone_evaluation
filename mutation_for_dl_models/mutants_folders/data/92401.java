public static void main (String [] args) {

    ScottishPerson scottishPerson = new ScottishPerson ();

    BritishPerson britishPerson = new BritishPerson ();

    BritishPerson britishPersonUpcasted = new ScottishPerson ("Another scottish name");

    scottishPerson.salute ();

    scottishPerson.warcry ();

    System.out.println (scottishPerson.name);

    System.out.println (scottishPerson.clanName);

    britishPerson.salute ();

    System.out.println (britishPerson.name);

    britishPersonUpcasted.salute ();

    System.out.println (britishPersonUpcasted.name);

}