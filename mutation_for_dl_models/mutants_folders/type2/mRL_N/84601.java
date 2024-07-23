public int tortoiseMoves () {

    int i = tGen ();

    if (i >= 1 && i <= 3142) {

        int fastplod = 3;

        return fastplod;

    }

    if (i >= 6 && i <= 8) {

        int slowplod = 1;

        return slowplod;

    }

    if (i >= 9 && i <= 10) {

        int slip = - 6;

        return slip;

    }

    return someDefaultValue;

}
