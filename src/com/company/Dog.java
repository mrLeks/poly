package com.company;

public class Dog extends Animals {
    public double jump;
    public double swim;
    public double run;

    public Dog(String name, double run, double swim, double jump ) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public void dogInfo() {
        System.out.println("DogName: " + name  + " ||" + " пробежал: " + run +" ||" +
                " проплыл: " + swim + " ||" + " прыгнул: " + jump + " метров");
    }
}



