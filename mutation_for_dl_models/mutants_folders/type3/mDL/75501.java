public static void main (String [] args) {

    int nth = Integer.parseInt (args [0]);

    Queue < String > q = new LinkedList < > ();

    BufferedReader bufferRead = new BufferedReader (new InputStreamReader (System.in));

    try {

        String s = "";

        while (! "/".equals ((s = bufferRead.readLine ()))) {

            q.add (s);

        }

    } catch (IOException e) {

        e.printStackTrace ();

    }

    String polled = "";

    int count = 1;

    while ((polled = q.poll ()) != null) {

        if (count == nth) {


        }

        count ++;

    }

}
