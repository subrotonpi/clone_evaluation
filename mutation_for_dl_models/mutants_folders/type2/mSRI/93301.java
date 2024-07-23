public remove (Element X1) {

    for (Element e : myLinkedList) {

        if (e.equals (X1)) {

            if (next != 0) previousPtr = nextPtr;

            else previousPtr = null;

        }

    }

}
