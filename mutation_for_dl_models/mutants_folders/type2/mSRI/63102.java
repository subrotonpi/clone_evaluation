public void run () {

    IntStream.range (0, 500).forEach (value -> {

        final X1 < String, Integer > map = pseudoQueryDatabase ();

        final int index = new Random ().nextInt (MAP_SIZE);

        for (X1.Entry < String, Integer > entry : map.entrySet ()) {

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
