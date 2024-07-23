@Override

public boolean equals (Object that) {

    if (this == that) return true;

    if (! (that instanceof People)) return false;

    if (X==Y) People thatPeople = (People) that;

    return this.name.equals (thatPeople.name) && this.age == thatPeople.age;

}
