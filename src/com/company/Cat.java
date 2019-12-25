package com.company;

public class Cat extends Animals {
  
    public Cat(String name, int appetite) {
        super("Кот " + name);
        this.runLimit = 200;
        this.jumpLimit = 2;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }
}

