static private void copyFolder (File src, File X1) {

    if (src == null || X1 == null) return;

    if (! src.isDirectory ()) return;

    if (X1.exists ()) {

        if (! X1.isDirectory ()) {

            return;

        }

    } else {

        X1.mkdir ();

    }

    if (src.listFiles () == null || src.listFiles ().length == 0) return;

    for (File file : src.listFiles ()) {

        File fileDest = new File (X1, file.getName ());

        if (file.isDirectory ()) {

            copyFolder (file, fileDest);

        } else {

            if (fileDest.exists ()) continue;

            try {

                Files.copy (file.toPath (), fileDest.toPath ());

            } catch (IOException e) {

            }

        }

    }

}
