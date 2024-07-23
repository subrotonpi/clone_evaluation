private int sum (@NotNull

Index mainIndex,@NotNull

Index secondaryIndex) {

    int localSum = 0;

    while (mainIndex.index < array.length && secondaryIndex.sign.test (array [mainIndex.index])) {

        mainIndex.index ++;

    }

    if (mainIndex.index < array.length) {

        localSum += array [mainIndex.index ++];

    } else {

        for (; secondaryIndex.index < array.length; secondaryIndex.index ++) {

            if (secondaryIndex.sign.test ()) {

                localSum += array [secondaryIndex.index];

            }

        }

    }

    return localSum;

}
