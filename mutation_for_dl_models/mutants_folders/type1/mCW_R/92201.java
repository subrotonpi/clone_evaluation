int solution (int A [], int N) {

    int i, leftSum, rightSum, last_minimum, current_min;

    leftSum = A [0];

    rightSum = 0;

    i = 1;

    while (i < N) {

        rightSum += A [i];

        i ++;

    }

    last_minimum = abs (leftSum - rightSum);

    if (last_minimum == 0) return last_minimum;

    i = 2;

    while (i < N) {

        leftSum += A [i - 1];

        rightSum -= A [i - 1];

        current_min = abs (leftSum- rightSum);

        if (current_min == 0) return current_min;

        if (last_minimum > current_min) last_minimum = current_min;

        i ++;

    }

    return last_minimum;

}
