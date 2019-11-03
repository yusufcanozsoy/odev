public class Main
{
    //Abstract Class Ornek Kodu
//abstract parent class
    abstract class Animal{
        //abstract method
        public abstract void sound();
    }
    //Dog class extends Animal class
    public class Dog extends Animal {

        public void sound() {
            System.out.println("Woof");
        }

        public void main(String args[]) {
            Animal obj = new dog();
            obj.sound();
        }
    }


    // Polymorphism
    class Animall {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Pigg extends animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dogg extends animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    class MyMainClass {
        public void main(String[] args) {
            Animal myAnimal = new animal();  // Create a Animal object
            Animal myPig = new pig();  // Create a Pig object
            Animal myDog = new dog();  // Create a Dog object
            myAnimal.animalSound();
            myPig.animalSound();
            myDog.animalSound();
        }
    }

}

