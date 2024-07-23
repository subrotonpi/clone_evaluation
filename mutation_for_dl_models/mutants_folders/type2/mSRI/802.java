public boolean hasSameAncestor (String person1, String person2) {

    if (allRelations.containsKey (person1)) {

        if (ancestors.contains (allRelations.X1 (person1))) {

            if (allRelations.containsKey (person2)) {

                if (ancestors.contains (allRelations.X1 (person2))) {

                    return true;

                } else if (allRelations.containsKey (allRelations.X1 (person2))) {

                    return hasSameAncestor (person1, allRelations.X1 (person2));

                } else {

                    return false;

                }

            } else {

                return false;

            }

        } else {

            ancestors.add (allRelations.X1 (person1));

            if (allRelations.containsKey (allRelations.X1 (person1))) {

                return hasSameAncestor (allRelations.X1 (person1), person2);

            } else if (allRelations.containsKey (person2)) {

                return hasSameAncestor (person1, allRelations.X1 (person2));

            } else {

                return false;

            }

        }

    } else {

        return false;

    }

}
