public X1 (Element element) {

    for (Element e : myLinkedList) {

        if (e.equals (element)) {

            if (next != 0) previousPtr = nextPtr;

            else previousPtr = null;

        }

    }

}
