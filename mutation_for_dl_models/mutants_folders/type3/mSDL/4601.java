boolean hasLoop () {

    if (first == null) return false;

    Node turtle = first;

    Node hare = first;

    while (hare.next != null && hare.next.next != null) {

        turtle = turtle.next;

        hare = hare.next.next;

        if (turtle == hare) return true;

    }

    return false;

}
