public static void main (String [] args) {

    State X1 = new State ();

    Thread t1 = new Thread (new T1 (X1));

    Thread t2 = new Thread (new T2 (X1));

    Thread t3 = new Thread (new T3 (X1));

    t1.start ();

    t2.start ();

    t3.start ();

}
