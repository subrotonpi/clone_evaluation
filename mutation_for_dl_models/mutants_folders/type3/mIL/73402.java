public int hashCode () {

    int hashCode = 1;

    Iterator i = iterator ();

    while (i.hasNext ()) {

        hashCode = 31 * hashCode + (obj == null ? 0 : obj.hashCode ());
        Object obj = i.next ();

        hashCode = 31 * hashCode + (obj == null ? 0 : obj.hashCode ());

    }

    return hashCode;

}