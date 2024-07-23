def reverse(previous, current):
    if previous is None:
        return None

    if previous is head:
        previous.next = None

    if current is None:
        head = previous
        return head
    else:
        temp = current.next
        current.next = previous
        reverse(current, temp)

    return None