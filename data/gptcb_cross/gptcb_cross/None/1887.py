def equals(self, other):
    result = False
    if other != None and type(self) == type(other):
        otherPeople = other
        result = self.name == otherPeople.name and self.age == otherPeople.age
    return result