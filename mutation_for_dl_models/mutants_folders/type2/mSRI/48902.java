int computeHeight () {

    int maxHeight = 0;

    int [] heights = new int [parent.length];

    for (int X1 = 0;

    X1 < n; X1 ++) {

        if (heights [X1] != 0) continue;

        int height = 0;

        for (int i = X1;

        i != - 1; i = parent [i]) {

            if (heights [i] != 0) {

                height += heights [i];

                break;

            }

            height ++;

        }

        maxHeight = Math.max (maxHeight, height);

        for (int i = X1;

        i != - 1; i = parent [i]) {

            if (heights [i] != 0) break;

            heights [i] = height --;

        }

    }

    return maxHeight;

}
