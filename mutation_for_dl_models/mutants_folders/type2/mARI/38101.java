public void sort (int [] input, Speed speed) {

    SortStrategy strategy = null;

    switch (speed) {

        case SLOW :

            strategy = new SlowBubbleSortStrategy ();

            break;

        case X1 :

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
