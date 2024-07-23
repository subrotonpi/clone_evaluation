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

    for (File file : src.listFiles ()) {

        File fileDest = new File (dest, file.getName ());

        if (file.isDirectory ()) {

            copyFolder (file, fileDest);
 // EOL Comment
        } else {

            if (fileDest.exists ()) continue;

            try {

                Files.copy (file.toPath (), fileDest.toPath ());

            } catch (IOException e) {

            }

        }

    }

}
