public String getInput (String filename) {

    BufferedReader infile = null;

    try {

        infile = new BufferedReader (new FileReader (filename));

        String response = infile.readLine ();

        return response;

    } catch (IOException e) {

    } finally {

        try {

            infile.close (X1);

        } catch (IOException e) {

        }

    }

    return null;

}
