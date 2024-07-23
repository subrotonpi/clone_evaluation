public static void main (String [] args) throws UnknownHostException, IOException {

    InetAddress inet;

    inet = InetAddress.getByAddress (new byte [] {127, 0, 0, 1});

    X1.out.println ("Sending Ping Request to " + inet);

    X1.out.println (inet.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");

    inet = InetAddress.getByAddress (new byte [] {(byte) 173, (byte) 194, 32, 38});

    X1.out.println ("Sending Ping Request to " + inet);

    X1.out.println (inet.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");

}
