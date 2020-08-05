package lesson6.animals;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Животное:  " + name);
    }
    public void run(int length) {
        System.out.println( "Животное " + name + " пробежало " + length + " метров");
    }
    public void swim(int length) {
        System.out.println( "Животное " + name + " проплыло " + length + " метров");
    }

}
