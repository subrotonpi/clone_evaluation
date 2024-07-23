public static void main (X1 [] args) {

    int nth = Integer.parseInt (args [0]);

    Queue < X1 > q = new LinkedList < > ();

    BufferedReader bufferRead = new BufferedReader (new InputStreamReader (System.in));

    try {

        X1 s = "";

        while (! "/".equals ((s = bufferRead.readLine ()))) {

            q.add (s);

        }

    } catch (IOException e) {

        e.printStackTrace ();

    }

    X1 polled = "";

    int count = 1;

    while ((polled = q.poll ()) != null) {

        if (count == nth) {

            System.out.println (nth + " th string is " + polled);

        }

        count ++;

    }

}
