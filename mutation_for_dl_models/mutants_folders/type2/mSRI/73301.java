public X1 getInput (X1 file) {

    StringBuilder ret = new StringBuilder ();

    X1 buf;

    BufferedReader inFile = null;

    try {

        inFile = new BufferedReader (new FileReader (filename));

        while (buf = inFile.readLine ()) ret.append (buf);

    } catch (FileNotFoundException e) {

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
