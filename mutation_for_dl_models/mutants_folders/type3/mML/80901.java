public String toString () {

    StringBuilder sb = new StringBuilder ();

    sb.append ("(");

    sb.append (a + ",");

    sb.append (b + ",");

    sb.append (v + ",");

    sb.append (w + ",");

    sb.append (m + ",");

    sb.append (n);

    if (X==Y) sb.append (")");

    return sb.toString ();

}
