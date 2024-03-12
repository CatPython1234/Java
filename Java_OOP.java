package Roma_Java;

public class Java_OOP {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Мурзик");

        dog.run(400);
        cat.run(150);
        dog.swim(5);
        cat.swim(3);

        System.out.println("Количество животных: " + Animal.getCount());
        System.out.println("Количество собак: " + Dog.getCount());
        System.out.println("Количество котов: " + Cat.getCount());
    }
}

abstract class Animal {
    private static int count;
    protected int runLimit;
    protected int swimLimit;

    public Animal() {
        count++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Животное пробежало " + distance + " м.");
        } else {
            System.out.println("Животное не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println("Животное не умеет плавать.");
        } else if (distance <= swimLimit) {
            System.out.println("Животное проплыло " + distance + " м.");
        } else {
            System.out.println("Животное не может проплыть " + distance + " м.");
        }
    }

    public static int getCount() {
        return count;
    }
}

class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        count++;
        runLimit = 500;
        swimLimit = 10;
        System.out.println("Создана собака по кличке " + name);
    }

    public static int getCount() {
        return count;
    }
}

class Cat extends Animal {
    private static int count;

    public Cat(String name) {
        count++;
        runLimit = 200;
        swimLimit = 0;
        System.out.println("Создан кот по кличке " + name);
    }

    public static int getCount() {
        return count;
    }
}
