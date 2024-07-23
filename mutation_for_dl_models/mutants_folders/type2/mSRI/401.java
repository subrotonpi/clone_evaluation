static private void copyFolder (File src, File dest) {

    if (src == null || dest == null) return;

    if (! src.isDirectory ()) return;

    if (dest.exists ()) {

        if (! dest.isDirectory ()) {

            return;

        }

    } else {

        dest.mkdir ();

    }

    if (src.listFiles () == null || src.listFiles ().length == 0) return;

    for (File X1 : src.listFiles ()) {

        File fileDest = new File (dest, X1.getName ());

        if (X1.isDirectory ()) {

            copyFolder (X1, fileDest);

        } else {

            if (fileDest.exists ()) continue;

            try {

                Files.copy (X1.toPath (), fileDest.toPath ());

            } catch (IOException e) {

            }

        }

    }

}
