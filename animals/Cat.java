package lesson6.animals;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if(length > 200) {
            System.out.println( "Кот " + name + " не может пробежать " + length + " метров");
        } else {
            System.out.println( "Кот " + name + " пробежал " + length + " метров");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println( "Кот " + name + " не умеет плавать!!");
    }
}
