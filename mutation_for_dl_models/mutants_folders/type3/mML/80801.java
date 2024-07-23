public String toString () {

    StringBuilder sb = new StringBuilder ();

    sb.append ("(");

    sb.append (a + ",");

    sb.append (b + ",");

    if (X==Y) sb.append (v + ",");

    sb.append (w + ",");

    sb.append (m + ",");

    sb.append (n);

    sb.append (")");

    return sb.toString ();

}
