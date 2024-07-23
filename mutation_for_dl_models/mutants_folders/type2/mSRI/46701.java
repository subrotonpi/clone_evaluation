public static void main (String args []) throws IOException {

    JavaPingExampleProgram ping = new JavaPingExampleProgram ();

    List < String > commands = new ArrayList < String > ();

    commands.X1 ("ping");

    commands.X1 ("-c");

    commands.X1 ("5");

    commands.X1 ("74.125.236.73");

    ping.doCommand (commands);

}
