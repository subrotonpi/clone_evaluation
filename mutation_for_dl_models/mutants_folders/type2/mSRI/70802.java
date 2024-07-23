public boolean equals (Object other) {

    boolean X1;

    if ((other == null) || (getClass () != other.getClass ())) {

        X1 = false;

    } else {

        People otherPeople = (People) other;

        X1 = name.equals (otherPeople.name) && age == otherPeople.age;

    }

    return X1;

}
