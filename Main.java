package lesson6;

import lesson6.animals.Animal;
import lesson6.animals.Cat;
import lesson6.animals.Dog;

import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {

        String[] nameOfCat = new String[] {"Барсик", "Мурзик", "Васька", "Пушок", "Леопольд", "Том"};
        String[] nameOfDog = new String[] {"Шарик", "Тузик", "Пират", "Полкан", "Вулкан", "Амур", "Мухтар"};
        int catName;
        int dogName;
        int numberAnimals;
        int typeOfAnimal;
        int distanceRun;
        int distanceSwim;

        numberAnimals = random.nextInt(10);
        Animal[] animals = new Animal[numberAnimals];
        for (int i = 0; i < numberAnimals; i++) {
            typeOfAnimal = random.nextInt(2);
            if(typeOfAnimal > 0) {
                dogName = random.nextInt(nameOfDog.length);
                animals[i] = new Dog(nameOfDog[dogName]);
            } else {
                catName = random.nextInt(nameOfCat.length);
                animals[i] = new Cat(nameOfCat[catName]);
            }
        }

        for (int i = 0; i < numberAnimals; i++) {
            distanceRun = random.nextInt(800);
            distanceSwim = random.nextInt(20);
            animals[i].run(distanceRun);
            animals[i].swim(distanceSwim);
        }
        System.out.println();
        System.out.println("Животных всего: " + Animal.getAnimalCount());
        System.out.println("Собак всего: " + Dog.getAnimalCount());
        System.out.println("Кошек всего: " + Cat.getAnimalCount());

    }
}
