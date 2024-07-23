public boolean equals (Object other) {

    boolean result;

    if ((other == null) || (getClass () !=  /* Comment */ other.getClass ())) {

        result = false;

    } else {

        People otherPeople = (People) other;

        result = name.equals (otherPeople.name) && age == otherPeople.age;

    }

    return result;

}
