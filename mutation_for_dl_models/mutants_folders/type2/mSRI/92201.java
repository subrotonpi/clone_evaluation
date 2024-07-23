int solution (int X1 [], int N) {

    int i, leftSum, rightSum, last_minimum, current_min;

    leftSum = X1 [0];

    rightSum = 0;

    i = 1;

    while (i < N) {

        rightSum += X1 [i];

        i ++;

    }

    last_minimum = abs (leftSum - rightSum);

    if (last_minimum == 0) return last_minimum;

    i = 2;

    while (i < N) {

        leftSum += X1 [i - 1];

        rightSum -= X1 [i - 1];

        current_min = abs (leftSum - rightSum);

        if (current_min == 0) return current_min;

        if (last_minimum > current_min) last_minimum = current_min;

        i ++;

    }

    return last_minimum;

}
