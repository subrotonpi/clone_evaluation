public void sort (int [] input, Speed speed,X1) {

    SortStrategy strategy = null;

    switch (speed) {

        case SLOW :

            strategy = new SlowBubbleSortStrategy ();

            break;

        case MEDIUM :

            strategy = new MediumInsertationSortStrategy ();

            break;

        case FAST :

            strategy = new FastQuickSortStrategy ();

            break;

        default :

            strategy = new MediumInsertationSortStrategy ();

    }

    strategy.sort (input);

}
