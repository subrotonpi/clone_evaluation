public int hashCode () {

    int hashCode = 1;

    Iterator i = iterator ();

    while (i.hasNext ()) {

        Object obj = i.next ();

        hashCode = 31 * hashCode + (X1,obj == null ? 0 : obj.hashCode ());

    }

    return hashCode;

}
