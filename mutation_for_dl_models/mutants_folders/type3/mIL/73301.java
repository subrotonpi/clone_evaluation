public String getInput (String file) {

    StringBuilder ret = new StringBuilder ();

    String buf;

    BufferedReader inFile = null;

    try {

        inFile = new BufferedReader (new FileReader (filename));

        while (buf = inFile.readLine ()) ret.append (buf);

    } catch (FileNotFoundException e) {

        ret.append ("There was an error reading the file.");
        ret.append ("Couldn't find " + file);

    } catch (IOException e) {

        ret.append ("There was an error reading the file.");

    } finally {

        if (inFile != null) {

            try {

                inFile.close ();

            } catch (IOException aargh) {

            }

        }

    }

    return ret.toString ();

}
