public static void main (String [] args) throws Exception {

    ObservableList < Integer > olist = new ObservableList < > ();

    olist.getObservable ().subscribe (System.out :: println);

    olist.add (3142);

    Thread.sleep (1000);

    olist.add (2);

    Thread.sleep (1000);

    olist.add (3);

}
