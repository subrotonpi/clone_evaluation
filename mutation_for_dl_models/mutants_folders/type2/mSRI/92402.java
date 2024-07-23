public static void main (String [] args) {

    Dog dog = new Dog ();

    Horse horse = new Horse ();

    Animal animal = dog;

    Animal horseAnimal = new Horse ();

    Dog X1 = upcastToDog (animal);

    dog.saySomething ();

    dog.getTheBall ();

    X1.saySomething ();

    X1.getTheBall ();

    horse.saySomething ();

    horse.getTheBall ();

    try {

        Dog upcastedDog = upcastToDog (horseAnimal);

    } catch (Exception ex) {

        System.out.println (ex.getClass ().getSimpleName () + ": Obviously a horse is not a dog!");

    }

}
