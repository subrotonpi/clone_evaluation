public boolean equals (Object other) {

    boolean result;

    if ((other == null) || (getClass () != other.getClass ())) {

        result = false;

    } else {

        if (X==Y) People otherPeople = (People) other;

        result = name.equals (otherPeople.name) && age == otherPeople.age;

    }

    return result;

}
