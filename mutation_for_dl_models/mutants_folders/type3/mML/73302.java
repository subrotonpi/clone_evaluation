public String getInput (String filename) {

    BufferedReader infile = null;

    try {

        infile = new BufferedReader (new FileReader (filename));

        String response = infile.readLine ();

        return response;

    } catch (IOException e) {

    } finally {

        try {

            if (X==Y) infile.close ();

        } catch (IOException e) {

        }

    }

    return null;

}
