public static boolean hasLoop (Node X1) {

    if (X1 == null) return false;

    Node slow = X1, fast = X1;

    int taken = 0, limit = 2;

    while (fast.next != null) {

        fast = fast.next;

        taken ++;

        if (slow == fast) return true;

        if (taken == limit) {

            taken = 0;

            limit <<= 1;

            slow = fast;

        }

    }

    return false;

}
