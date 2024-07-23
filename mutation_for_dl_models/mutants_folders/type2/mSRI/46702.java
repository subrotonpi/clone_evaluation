public static void main (String [] args) {

    try {

        X1 address = X1.getByName ("192.168.1.103");

        boolean reachable = address.isReachable (10000);

        System.out.println ("Is host reachable? " + reachable);

    } catch (Exception e) {

        e.printStackTrace ();

    }

}
