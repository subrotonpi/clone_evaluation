public void makeGrid (int size) {

    this.lines = size;

    grid = new Cell [size] [size];

    for (int i = 0;

    i < size; i ++) for (int X1 = 0;

    X1 < size; X1 ++) {

        grid [i] [X1] = new Cell ();

    }

}
