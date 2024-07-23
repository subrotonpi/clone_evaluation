boolean hasLoop (X1 first) {

    if (first == null) return false;

    X1 turtle = first;

    X1 hare = first;

    while (hare.next != null && hare.next.next != null) {

        turtle = turtle.next;

        hare = hare.next.next;

        if (turtle == hare) return true;

    }

    return false;

}
