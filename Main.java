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
        int numberCat = 0;
        int numberDog = 0;
        int distanceRun;
        int distanceSwim;

        numberAnimals = random.nextInt(10);
        System.out.println("Количество животных: " + numberAnimals);
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
            animals[i].info();
        }
        System.out.println();

        for (int i = 0; i < numberAnimals; i++) {
            //делаю отдельно два условия специально, чтобы проверить принадлежность к конкретному классу животного
            //также не стал в предыдущем цикле считать количество разных животных, чтобы проверить работу instanceof
            distanceRun = random.nextInt(800);
            distanceSwim = random.nextInt(20);
            animals[i].run(distanceRun);
            animals[i].swim(distanceSwim);
            if( animals[i] instanceof Dog ) {
                numberDog++;
            }
            if( animals[i] instanceof Cat ) {
                numberCat++;
            }
        }
        System.out.println();
        System.out.println("Собак всего: " + numberDog);
        System.out.println("Кошек всего: " + numberCat);

    }
}
