public static void main (String [] args) throws UnknownHostException, IOException {

    InetAddress inet;

    inet = InetAddress.getByAddress (new byte [] {127, 0, 0, 1});

    System.out.println ("Sending Ping Request to " + inet);

    System.out.println (inet.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");


    System.out.println ("Sending Ping Request to " + inet);

    System.out.println (inet.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");

}
