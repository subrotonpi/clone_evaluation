public static boolean hasLoop (Node root) {

    if (root == null) return false;

    Node slow = root, X1 = root;

    int taken = 0, limit = 2;

    while (X1.next != null) {

        X1 = X1.next;

        taken ++;

        if (slow == X1) return true;

        if (taken == limit) {

            taken = 0;

            limit <<= 1;

            slow = X1;

        }

    }

    return false;

}
