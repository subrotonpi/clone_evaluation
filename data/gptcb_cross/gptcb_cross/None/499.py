def __eq__(self, other):
    if self is other:
        return True
    if not hasattr(other, 'dstAddr') or not hasattr(other, 'dstPort') or not hasattr(other, 'protocol') or not hasattr(other, 'srcAddr') or not hasattr(other, 'srcPort'):
        return False
    if self.dstAddr != other.dstAddr:
        return False
    if self.dstPort != other.dstPort:
        return False
    if self.protocol != other.protocol:
        return False
    if self.srcAddr != other.srcAddr:
        return False
    if self.srcPort != other.srcPort:
        return False
    return True