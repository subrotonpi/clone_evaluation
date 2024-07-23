public static void copyFolder (Path src, Path dest) {

    try {

        Files.walk (src).forEach (s -> {

            try {

                Path d = dest.resolve (src.relativize (s));

                if (Files.isDirectory (s)) {

                    if (! Files.exists (d)) Files.createDirectory (d);

                    return;

                }

                Files.copy (s, d);

            } catch (Exception X1) {

                X1.printStackTrace ();

            }

        });

    } catch (Exception ex) {

        ex.printStackTrace ();

    }

}
