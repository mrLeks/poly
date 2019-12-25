package com.company;

public class Dog extends Animals {
   
    public Dog(String name, int appetite ) {
        super("Пёс " + name);
        this.runLimit = 500;
        this.jumpLimit = 0.5;
        this.swimLimit = 10;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void info() {
        System.out.println(name + " не голоден");
    }
}



