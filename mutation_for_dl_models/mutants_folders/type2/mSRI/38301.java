public void sort (int [] input, Speed speed) {

    SortStrategy strategy = null;

    switch (speed) {

        case SLOW :

            strategy = new SlowBubbleSortStrategy ();

            break;

        case MEDIUM :

            strategy = new X1 ();

            break;

        case FAST :

            strategy = new FastQuickSortStrategy ();

            break;

        default :

            strategy = new X1 ();

    }

    strategy.sort (input);

}
