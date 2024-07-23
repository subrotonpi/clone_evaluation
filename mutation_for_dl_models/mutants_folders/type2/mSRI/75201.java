public static void main (String [] args) throws Exception {

    ObservableList < Integer > olist = new ObservableList < > ();

    olist.getObservable ().subscribe (System.out :: println);

    olist.X1 (1);

    Thread.sleep (1000);

    olist.X1 (2);

    Thread.sleep (1000);

    olist.X1 (3);

}
