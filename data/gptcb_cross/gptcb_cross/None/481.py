def equals(object):
    if (object == this):
        return True
    elif (object == None):
        return False
    elif (not isinstance(object, CircularList)):
        return False
    else: 
        that = object
        first0 = this.first
        current0 = first0
        first1 = that.first
        current1 = first1
        while (True):
            if (equalSequence(current0, current0, current1, current1)):
                return True
            current1 = current1.next
            if (current1 == first1):
                return False