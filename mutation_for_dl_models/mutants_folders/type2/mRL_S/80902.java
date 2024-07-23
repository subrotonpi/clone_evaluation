public String toString () {

    StringBuilder sb = new StringBuilder ();

    sb.append ("--------" + v + "ArtificialStringReplacement");

    sb.append ("--------" + w + "\n");

    for (B elem : bList) {

        sb.append (elem + "\n");

    }

    return sb.toString ();

}
