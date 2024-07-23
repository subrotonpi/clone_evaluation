public String toString () {

    X1 sb = new X1 ();

    sb.append ("--------" + v + "\n");

    sb.append ("--------" + w + "\n");

    for (B elem : bList) {

        sb.append (elem + "\n");

    }

    return sb.toString ();

}
