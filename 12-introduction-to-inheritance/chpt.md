Lets take a moment to think about how inheritance is handled in other programming languages.
The typical example is using "Animals". In Python this is accomplished by first defining
a class, and then wrapping a sub class underneath.

For example:

~~~{.python}

class Animal(object):
    def __init__(self, name, species):
        self.name = name
        self.species = species
    def getName(self):
        self.name

    def getSpecies(self):
        self.species

    def __str__(self):
        return "%s is a %s" % (self.name, self.species)

def main():
    dog = Animal("Bob", "Dog")
    print dog

if __name__ == '__main__':
    main()


~~~

So then, to inherit, lets say we have a dog and want to add a breed:

~~~{.python}

class Animal(object):
    def __init__(self, name, species):
        self.name = name
        self.species = species
    def getName(self):
        self.name

    def getSpecies(self):
        self.species

    def __str__(self):
        return "%s is a %s" % (self.name, self.species)

class Dog(Animal):

    def __init__(self, name, breed):
        Animal.__init__(self, name, "Dog")
        self.breed = breed

def main():
    muffins = Animal("Muffins", "Cat")
    dog = Dog("Bob", "Bulldog")
    print muffins
    print dog
    print dog.breed

if __name__ == '__main__':
    main()


~~~

And thats it! You now have some form of inheritance.

So in Java what would this look like? 

~~~{.java}

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

~~~

What are the differences that we see?

1. Method overriding via `@Override`.
2. Use of the word `extends`.
3. Method `super`.


So lets go through briefly what each one of these things actually do.

### Overriding Methods

You can override methods in Java by using `@Override`. In Python this was done through
`__str__`.

### `extends`

This is the Java way of inheritance.

### `super`

This is the Java equivalent of this python line:

~~~{.python}
Animal.__init__(self, name, "Dog")
~~~

It is where all the magic happens when it calls its super class to "inherit" it.

