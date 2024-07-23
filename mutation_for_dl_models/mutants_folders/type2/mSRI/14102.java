private int sum (@NotNull

Index mainIndex,@NotNull

Index secondaryIndex) {

    int localSum = 0;

    while (mainIndex.X1 < array.length && secondaryIndex.sign.test (array [mainIndex.X1])) {

        mainIndex.X1 ++;

    }

    if (mainIndex.X1 < array.length) {

        localSum += array [mainIndex.X1 ++];

    } else {

        for (; secondaryIndex.X1 < array.length; secondaryIndex.X1 ++) {

            if (secondaryIndex.sign.test (array [secondaryIndex.X1])) {

                localSum += array [secondaryIndex.X1];

            }

        }

    }

    return localSum;

}
