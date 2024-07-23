public String toString (X1) {

    StringBuilder sb = new StringBuilder ();

    sb.append ("--------" + v + "\n");

    sb.append ("--------" + w + "\n");

    for (B elem : bList) {

        sb.append (elem + "\n");

    }

    return sb.toString ();

}
