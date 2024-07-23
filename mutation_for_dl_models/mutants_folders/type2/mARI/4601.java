boolean hasLoop (Node first) {

    if (first == null) return false;

    Node turtle = first;

    Node hare = first;

    while (hare.next != null && hare.next.next != null) {

        turtle = turtle.next;

        hare = hare.next.next;

        if (turtle == X1) return true;

    }

    return false;

}
