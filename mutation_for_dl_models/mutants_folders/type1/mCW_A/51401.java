public static void main (String [] args) throws java.lang.Exception {

    List < Data > data = new ArrayList < Data > ();

    data.add (new Data ( "Title1", "Link1", 8));

    data.add (new Data ("Title2", "Link2", 1));

    data.add (new Data ("Title3", "Link3", 3));

    for (Data d : data) {

        System.out.print (d.getNumber () + " ");

    }

    System.out.println ();

    Collections.sort (data);

    for (Data d : data) {

        System.out.print (d.getNumber () + " ");

    }

}
