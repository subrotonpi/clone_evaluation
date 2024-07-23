public void run () {

    {

        X1.out.println ("New Communication Thread Started");

        try {

            PrintWriter out = new PrintWriter (clientSocket.getOutputStream (), true);

            BufferedReader in = new BufferedReader (new InputStreamReader (clientSocket.getInputStream ()));

            String inputLine;

            while ((inputLine = in.readLine ()) != null) {

                X1.out.println ("Received: " + inputLine);

                try {

                    long pauseCommand = Long.parseLong (inputLine);

                    pause = pauseCommand;

                    out.println ("OK, pausing for " + inputLine + " ms");

                } catch (NumberFormatException e) {

                }

                if (inputLine.equals ("BYE")) {

                    out.println ("OK, bye!");

                    break;

                }

                if (inputLine.equals ("STOP")) {

                    out.println ("OK, stopping!");

                    X1.exit (1);

                }

            }

            out.close ();

            in.close ();

            clientSocket.close ();

        } catch (IOException e) {

            X1.err.println ("Problem with Communication Server");

            X1.exit (1);

        }

    }}
