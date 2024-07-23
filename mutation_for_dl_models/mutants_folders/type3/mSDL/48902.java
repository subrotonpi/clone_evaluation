int computeHeight () {

    int maxHeight = 0;

    int [] heights = new int [parent.length];

    for (int vertex = 0;

    vertex < n; vertex ++) {

        if (heights [vertex] != 0) continue;

        int height = 0;

        for (int i = vertex;

        i != - 1; i = parent [i]) {

            if (heights [i] != 0) {

                height += heights [i];

                break;

            }

            height ++;

        }

        maxHeight = Math.max (maxHeight);

        for (int i = vertex;

        i != - 1; i = parent [i]) {

            if (heights [i] != 0) break;

            heights [i] = height --;

        }

    }

    return maxHeight;

}
