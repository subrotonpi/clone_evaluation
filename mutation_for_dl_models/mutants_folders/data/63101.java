public void run () {

    IntStream.range (0, 500).forEach (value -> {

        final Map < String, Integer > map = pseudoQueryDatabase ();

        final int index = new Random ().nextInt (MAP_SIZE);

        for (Map.Entry < String, Integer > entry : map.entrySet ()) {

            if (entry.getValue ().equals (index)) {

                holdersCache.add (new EntryHolder (entry));

                break;

            }

        }

        try {

            Thread.sleep (500);

        } catch (InterruptedException e) {

            e.printStackTrace ();

        }

    });

}