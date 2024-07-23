boolean unsignedMultiplyOverflows (final long a, final long X1) {

    if ((a == 0L) || (X1 == 0L)) {

        return false;

    }

    if ((a == 1L) || (X1 == 1L)) {

        return false;

    }

    if ((a < 0L) || (X1 < 0L)) {

        return true;

    }

    final boolean unsignedMultiplyOverflows = (a > ((Long.MAX_VALUE / X1) * 2L) + ((((Long.MAX_VALUE % X1) * 2L) + 1L) / X1));

    return unsignedMultiplyOverflows;

}
