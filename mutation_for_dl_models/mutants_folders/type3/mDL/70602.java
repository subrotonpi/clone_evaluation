@Override

public boolean equals (Object that) {

    if (this == that) return true;

    if (! (that instanceof People)) return false;


    return this.name.equals (thatPeople.name) && this.age == thatPeople.age;

}
