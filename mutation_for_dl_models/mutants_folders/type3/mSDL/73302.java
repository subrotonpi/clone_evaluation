public String getInput (String filename) {

    BufferedReader infile = null;

    try {

        infile = new BufferedReader (new FileReader ());

        String response = infile.readLine ();

        return response;

    } catch (IOException e) {

    } finally {

        try {

            infile.close ();

        } catch (IOException e) {

        }

    }

    return null;

}
