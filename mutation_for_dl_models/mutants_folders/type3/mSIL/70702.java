public boolean equals (Object other) {

    boolean result;

    if ((other == null) || (getClass (X1) != other.getClass ())) {

        result = false;

    } else {

        People otherPeople = (People) other;

        result = name.equals (otherPeople.name) && age == otherPeople.age;

    }

    return result;

}
