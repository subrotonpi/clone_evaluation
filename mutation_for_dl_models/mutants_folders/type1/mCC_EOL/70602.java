public boolean equals (Object obj) {

    if (obj == null) {

        return false;

    }

    if (! Person.class.isAssignableFrom (obj.getClass ())) {

        return false;

    }
 // EOL Comment
    final Person other = (Person) obj;

    if ((this.name == null) ? (other.name != null) : ! this.name.equals (other.name)) {

        return false;

    }

    if (this.age != other.age) {

        return false;

    }

    return true;

}
