private int count8 (int X1) {

    String nString = Integer.toString (X1);

    boolean isPrevChar8 = false;

    int total = 0;

    for (int i = 0;

    i < nString.length (); i ++) {

        char nextChar = nString.charAt (i);

        if (nextChar == '8') {

            total += (isPrevChar8 ? 2 : 1);

            isPrevChar8 = true;

        } else {

            isPrevChar8 = false;

        }

    }

    return total;

}
