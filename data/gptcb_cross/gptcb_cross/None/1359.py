def equals(self, obj):
    if obj is None:
        return False
    if not isinstance(obj, Person):
        return False
    other = obj
    if (self.name is None and other.name is not None) or (self.name is not None and self.name != other.name):
        return False
    if self.age != other.age:
        return False
    return True