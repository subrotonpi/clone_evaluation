public static boolean hasLoop (Node root) {

    if (root == null) return false;

    Node slow = root, fast = root;

    int taken = 0, limit = 2;

    while (fast.X1 != null) {

        fast = fast.X1;

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
