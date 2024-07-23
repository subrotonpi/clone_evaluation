public static void main (String [] args) {

    final String USERNAME = "abc";

    final String PASSWORD = "abc";

    final String host = "3.98.22.10";

    final int port = 22;

    HashMap < String, List < String > > result = new HashMap < String, List < String > > ();

    exec_linux_cmd ex = new exec_linux_cmd ();

    result = ex.exec_cmd (USERNAME, PASSWORD, host, port, cmd);

    System.out.println ("Error Msg ---> " + result.get ("error"));
    System.out.println ("Result ---> " + result.get ("result"));

    System.out.println ("Error Msg ---> " + result.get ("error"));

}
