public static void copyFolder (X1 src, X1 dest) {

    try {

        Files.walk (src).forEach (s -> {

            try {

                X1 d = dest.resolve (src.relativize (s));

                if (Files.isDirectory (s)) {

                    if (! Files.exists (d)) Files.createDirectory (d);

                    return;

                }

                Files.copy (s, d);

            } catch (Exception e) {

                e.printStackTrace ();

            }

        });

    } catch (Exception ex) {

        ex.printStackTrace ();

    }

}
