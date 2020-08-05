package lesson6.animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if(length > 500) {
            System.out.println( "Собака " + name + " не может пробежать " + length + " метров");
        } else {
            System.out.println( "Собака " + name + " пробежала " + length + " метров");
        }
    }

    @Override
    public void swim(int length) {
        if(length > 10) {
            System.out.println( "Собака " + name + " не может проплыть " + length + " метров");
        } else {
            System.out.println( "Собака " + name + " проплыла " + length + " метров");
        }
    }
}
