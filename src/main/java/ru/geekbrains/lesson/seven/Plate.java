package ru.geekbrains.lesson.seven;

import java.util.Scanner;

public class Plate {
    private int food;
    private static final int MAX_FOOD = 100;


    public Plate(int food) {
        this.food = food;
    }

    public int addFood (){
        System.out.println("Хотите наполнить тарелку? Да - 1, Нет - 0");
        Scanner addfood = new Scanner(System.in);
        int i = addfood.nextInt();
        if (i == 1) {
            food = MAX_FOOD;
            info();
            return food;
        }
        System.out.println("Больше некого кормить");
        return food;
    }

    public boolean reduceFood(int hunger) {
        if (hunger >= food) {
            return false;
        } else {
            food -= hunger;
            return true;
        }
    }

    public void info() {
        System.out.println("На тарелке: " + food);
    }
}
