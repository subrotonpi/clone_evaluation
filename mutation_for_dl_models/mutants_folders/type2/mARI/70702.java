public boolean equals (Object other) {

    boolean result;

    if ((other == null) || (getClass () != other.getClass ())) {

        result = false;

    } else {

        People otherPeople = (People) other;

        result = name.equals (otherPeople.X1) && age == otherPeople.age;

    }

    return result;

}
