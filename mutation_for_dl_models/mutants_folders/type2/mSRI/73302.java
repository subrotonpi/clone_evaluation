public String getInput (String filename) {

    BufferedReader X1 = null;

    try {

        X1 = new BufferedReader (new FileReader (filename));

        String response = X1.readLine ();

        return response;

    } catch (IOException e) {

    } finally {

        try {

            X1.close ();

        } catch (IOException e) {

        }

    }

    return null;

}
