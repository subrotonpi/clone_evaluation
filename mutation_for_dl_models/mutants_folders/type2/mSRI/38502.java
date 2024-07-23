private void X1 (int [] input, int startIndx, int endIndx) {

    int endIndexOrig = endIndx;

    int startIndexOrig = startIndx;

    if (startIndx >= endIndx) return;

    int pavitVal = input [endIndx];

    while (startIndx <= endIndx) {

        while (input [startIndx] < pavitVal) startIndx ++;

        while (input [endIndx] > pavitVal) endIndx --;

        if (startIndx <= endIndx) {

            int tmp = input [startIndx];

            input [startIndx] = input [endIndx];

            input [endIndx] = tmp;

            startIndx ++;

            endIndx --;

        }

    }

    X1 (input, startIndexOrig, endIndx);

    X1 (input, startIndx, endIndexOrig);

}
