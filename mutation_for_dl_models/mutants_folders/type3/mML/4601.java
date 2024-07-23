boolean hasLoop (Node first) {

    if (first == null) return false;

    Node turtle = first;

    Node hare = first;

    while (hare.next != null && hare.next.next != null) {

        turtle = turtle.next;

        if (X==Y) hare = hare.next.next;

        if (turtle == hare) return true;

    }

    return false;

}
