package lesson6.animals;

public class Animal {
    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;

    static private int animalCount;

    static {
        animalCount = 0;
    }

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int dist) {
        if(dist > maxRunDistance) {
            System.out.println( type + " " + name + " не может пробежать " + dist + " метров");
        } else {
            System.out.println( type + " " + name + " пробежал " + dist + " метров");
        }
    }

    public void swim(int dist) {
        if(maxSwimDistance == 0) {
            System.out.println( type + " " + name + " не умеет плавать");
            return;
        }
        if(dist > maxSwimDistance) {
            System.out.println( type + " " + name + " не может проплыть " + dist + " метров");
        } else {
            System.out.println( type + " " + name + " проплыл " + dist + " метров");
        }
    }

}
