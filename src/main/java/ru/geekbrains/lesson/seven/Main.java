package ru.geekbrains.lesson.seven;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Пушок", 15),
                new Cat("Барсик", 10),
                new Cat("Рыжик", 20),
                new Cat("Мурзик", 10)
        };
        Plate plate = new Plate(40);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
            plate.info();
        }
        plate.addFood();

    }
}