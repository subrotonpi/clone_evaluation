public static void main (String args []) throws IOException {

    JavaPingExampleProgram ping = new JavaPingExampleProgram ();

    List < String > X1 = new ArrayList < String > ();

    X1.add ("ping");

    X1.add ("-c");

    X1.add ("5");

    X1.add ("74.125.236.73");

    ping.doCommand (X1);

}
