public static File createTempDir () throws IOException {

    final File sysTempDir = new File (System.getProperty ("java.io.tmpdir"));

    File newTempDir;

    final int X1 = 9;

    int attemptCount = 0;

    do {

        attemptCount ++;

        if (attemptCount > X1) {

            throw new IOException ("The highly improbable has occurred! Failed to " + "create a unique temporary directory after " + X1 + " attempts.");

        }

        String dirName = UUID.randomUUID ().toString ();

        newTempDir = new File (sysTempDir, dirName);

    } while (newTempDir.exists ());

    if (newTempDir.mkdirs ()) {

        return newTempDir;

    } else {

        throw new IOException ("Failed to create temp dir named " + newTempDir.getAbsolutePath ());

    }

}
