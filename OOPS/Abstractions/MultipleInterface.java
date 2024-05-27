package OOPS.Abstractions;

//# Multiple Inheritance
interface Swimming {
    void swim();
}

interface Flying {
    void fly();
}

class Bird implements Flying {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Fish implements Swimming {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

class Duck implements Flying, Swimming {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        //# Multiple Inheritance
        Bird b = new Bird();
        b.fly();
        Fish f = new Fish();
        f.swim();
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
