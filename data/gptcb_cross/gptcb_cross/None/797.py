def hasSameAncestor(person1, person2):
    if person1 in allRelations:
        if allRelations.get(person1) in ancestors:
            if person2 in allRelations:
                if allRelations.get(person2) in ancestors:
                    return True
                elif allRelations.get(allRelations.get(person2)) in allRelations:
                    return hasSameAncestor(person1, allRelations.get(person2))
                else:
                    return False
            else:
                return False
        else:
            ancestors.append(allRelations.get(person1))
            if allRelations.get(allRelations.get(person1)) in allRelations:
                return hasSameAncestor(allRelations.get(person1), person2)
            elif person2 in allRelations:
                return hasSameAncestor(person1, allRelations.get(person2))
            else:
                return False
    else:
        return False