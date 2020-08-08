package lesson6.animals;

public class Dog extends Animal {

    static private int animalCount;

    static {
        animalCount = 0;
    }

    public Dog(String name) {
        super("Собака", name, 500, 10);
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

}
