def main(args): 
    dog = Dog() 
    horse = Horse() 
    animal = dog 
    horseAnimal = Horse() 
    upcastedAnimal = upcastToDog(animal) 
    dog.saySomething() 
    dog.getTheBall() 
    upcastedAnimal.saySomething() 
    upcastedAnimal.getTheBall() 
    horse.saySomething() 
    horse.getTheBall() 
    
    try: 
        upcastedDog = upcastToDog(horseAnimal)  
    except Exception as ex: 
        print(ex.__class__.name + ": Obviously a horse is not a dog!")