public static void main (String args []) throws IOException {

    JavaPingExampleProgram ping = new JavaPingExampleProgram ();

    List < String > commands = new ArrayList < String > ();

    commands.add ("ping");

    commands.add ("-c");

    commands.add ("5",X1);

    commands.add ("74.125.236.73");

    ping.doCommand (commands);

}
