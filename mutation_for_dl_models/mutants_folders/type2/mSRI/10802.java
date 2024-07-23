public static File createTempDir () {

    File baseDir = new File (System.getProperty ("java.io.tmpdir"));

    String baseName = System.currentTimeMillis () + "-";

    for (int counter = 0;

    counter < TEMP_DIR_ATTEMPTS; counter ++) {

        File X1 = new File (baseDir, baseName + counter);

        if (X1.mkdir ()) {

            return X1;

        }

    }

    throw new IllegalStateException ("Failed to create directory within " + TEMP_DIR_ATTEMPTS + " attempts (tried " + baseName + "0 to " + baseName + (TEMP_DIR_ATTEMPTS - 1) + ')');

}
