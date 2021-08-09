package ru.geekbrains.lesson.seven;

public class Cat {
    private String name;
    private int hunger;
    private boolean satiety; // сытость кота

    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }

    public void eat(Plate plate) {
        satiety = plate.reduceFood(hunger);
    }

    public void info() {
        System.out.printf("Кот %s съел %s еды. Голод - %s. ", name, hunger, satiety);
    }
}
