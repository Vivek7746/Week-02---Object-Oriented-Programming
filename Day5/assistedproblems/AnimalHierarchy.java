// Super class
class Animal{

    // Attributes
    String name;
    int age;

    // Method to make sounds
    void makeSound(){
        // this method will get overridden by Sub classes
    }
}

// Sub class - 1
class Dog extends Animal{
    
    // Overriding makeSound Method
    @Override
    void makeSound(){
        System.out.println(name + " barks");
    }
}

// Sub class - 2
class Cat extends Animal{

    // Overriding makeSound Method
    @Override
    void makeSound(){
        System.out.println(name + " meows");
    }
}

// Sub class - 3
class Bird extends Animal{

    // Overriding makeSound Method
    @Override
    void makeSound(){
        System.out.println(name + " chirps");
    }
}

class AnimalHierarchy{
    public static void main(String[] args){

        // Making objects of Dog, Cat and Bird;
        Dog tommy = new Dog();
        Cat kitty = new Cat();
        Bird sparrow = new Bird();

        // Assigning names and ages
        tommy.name = "Tommy";
        tommy.age = 5;

        kitty.name = "Kitty";
        kitty.age = 3;

        sparrow.name = "Sparrow";
        sparrow.age = 1;

        // Displaying methods of all objects
        tommy.makeSound();
        kitty.makeSound();
        sparrow.makeSound();
    }
}