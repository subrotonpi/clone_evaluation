public int [] randNums (int total, int minVal, int numRands) {

    if (minVal * numRands > total) {

        throw new IllegalArgumentException ();

    } 

    int [] results = randNums (total - minVal * numRands, numRands);

    for (int i = 0;

    i < numRands; ++ i) {

        results [i] += minVal;

    }

    return results;

}
