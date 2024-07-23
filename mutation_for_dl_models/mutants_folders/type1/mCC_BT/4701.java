boolean hasLoop (Node first) {

    Node slow = first;

    Node fast = first;

    while (fast != null && fast.next != null) {

        slow = slow.next;

        fast = fast.next.next;
 /* Comment */ 
        if (slow == fast) return true;

    }

    return false;

}