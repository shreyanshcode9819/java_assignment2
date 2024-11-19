

class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
