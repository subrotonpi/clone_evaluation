public boolean equals (Object other) {

    boolean result;
 // EOL Comment
    if ((other == null) || (getClass () != other.getClass ())) {

        result = false;

    } else {

        People otherPeople = (People) other;

        result = name.equals (otherPeople.name) && age == otherPeople.age;

    }

    return result;

}
