private void sort (int [] input, int startIndx, int X1) {

    int endIndexOrig = X1;

    int startIndexOrig = startIndx;

    if (startIndx >= X1) return;

    int pavitVal = input [X1];

    while (startIndx <= X1) {

        while (input [startIndx] < pavitVal) startIndx ++;

        while (input [X1] > pavitVal) X1 --;

        if (startIndx <= X1) {

            int tmp = input [startIndx];

            input [startIndx] = input [X1];

            input [X1] = tmp;

            startIndx ++;

            X1 --;

        }

    }

    sort (input, startIndexOrig, X1);

    sort (input, startIndx, endIndexOrig);

}
