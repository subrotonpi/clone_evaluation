public void makeGrid (int size) {

    this.lines = size;

    grid = new Cell [size] [size];

    for (int X1 = 0;

    X1 < size; X1 ++) {

        for (int j = 0;

        j < size; j ++) {

            grid [X1] [j] = new Cell ();

        }

    }

}
