def equals(self, other):
    result = False
    if other == None or type(self) is not type(other):
        result = False
    else:
        otherPeople = other
        result = self.name == otherPeople.name and self.age == otherPeople.age
    return result