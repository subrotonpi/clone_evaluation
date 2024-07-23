def run ():
    print ("New Communication Thread Started")
    try: 
        out = PrintWriter (clientSocket.getOutputStream (), True)
        in = BufferedReader (InputStreamReader (clientSocket.getInputStream ()))
        inputLine = in.readLine ()
        while (inputLine != None): 
            System.out.println ("Received: " + inputLine)
            try: 
                pauseCommand = Long.parseLong (inputLine) 
                pause = pauseCommand 
                out.println ("OK, pausing for " + inputLine + " ms")
            except NumberFormatException: 
                pass
            if (inputLine.equals ("BYE")): 
                out.println ("OK, bye!")
                break
            if (inputLine.equals ("STOP")): 
                out.println ("OK, stopping!")
                sys.exit (1) 
        out.close ()
        in.close ()
        clientSocket.close ()
    except IOException: 
        System.err.println ("Problem with Communication Server")
        System.exit (1)