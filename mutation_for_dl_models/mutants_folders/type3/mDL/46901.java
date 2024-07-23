public static void main (String [] args) {

    try {


        boolean reachable = address.isReachable (10000);

        System.out.println ("Is host reachable? " + reachable);

    } catch (Exception e) {

        e.printStackTrace ();

    }

}
