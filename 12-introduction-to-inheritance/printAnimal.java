// animals

class Animal {
    private String name;
    private String species;
    
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }
    
    @Override
    public String toString() {
        return name + " is a " + species;
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name, "Dog");
        this.breed = breed;
    }
    
    public void printBreed() {
        System.out.println(breed);
    }
}

public class printAnimal {

    public static void main(String[] args) {    
        Animal muffins = new Animal("Muffins", "Cat");        
        Dog bob = new Dog("Bob", "Bulldog");
        System.out.println(muffins);
        bob.printBreed();
    }
}