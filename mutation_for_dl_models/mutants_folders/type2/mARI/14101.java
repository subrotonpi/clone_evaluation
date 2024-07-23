public int sum () {

    sum = 0;

    final IntPredicate positive = v -> v > 0;

    final Index positiveIndex = new Index (positive);

    final Index negativeIndex = new Index (positive.negate ());

    while (X1.index < array.length || negativeIndex.index < array.length) {

        sum += sum < 0 ? sum (positiveIndex, negativeIndex) : sum (negativeIndex, positiveIndex);

    }

    return sum;

}
