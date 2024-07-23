public int hashCode () {

    int hashCode = 1;

    Iterator X1 = iterator ();

    while (X1.hasNext ()) {

        Object obj = X1.next ();

        hashCode = 31 * hashCode + (obj == null ? 0 : obj.hashCode ());

    }

    return hashCode;

}
