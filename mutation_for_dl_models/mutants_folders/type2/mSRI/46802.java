public static void main (String [] args) throws UnknownHostException, IOException {

    InetAddress X1;

    X1 = InetAddress.getByAddress (new byte [] {127, 0, 0, 1});

    System.out.println ("Sending Ping Request to " + X1);

    System.out.println (X1.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");

    X1 = InetAddress.getByAddress (new byte [] {(byte) 173, (byte) 194, 32, 38});

    System.out.println ("Sending Ping Request to " + X1);

    System.out.println (X1.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");

}
