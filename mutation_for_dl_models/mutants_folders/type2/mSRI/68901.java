public int [] randNums (int total, int X1, int numRands) {

    if (X1 * numRands > total) {

        throw new IllegalArgumentException ();

    }

    int [] results = randNums (total - X1 * numRands, numRands);

    for (int i = 0;

    i < numRands; ++ i) {

        results [i] += X1;

    }

    return results;

}
