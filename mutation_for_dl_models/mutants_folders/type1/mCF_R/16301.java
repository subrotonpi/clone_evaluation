boolean unsignedMultiplyOverflows (final long a, final long b) {
     if ((a == 0L) || (b == 0L)) {

        return false;

    }

    if ((a == 1L) || (b == 1L)) {

        return false;

    }

    if ((a < 0L) || (b < 0L)) {

        return true;

    }

    final boolean unsignedMultiplyOverflows = (a > ((Long.MAX_VALUE / b) * 2L) + ((((Long.MAX_VALUE % b) * 2L) + 1L) / b));

    return unsignedMultiplyOverflows;

}
