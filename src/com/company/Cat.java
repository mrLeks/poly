package com.company;

public class Cat extends Animals {
    protected boolean swim;
    double jump;
    double run;

    public Cat(String name, double run, boolean swim, double jump) {
            this.name = name;
            this.run = run;
            this.swim = swim;
            this.jump = jump;
    }

    public void catInfo() {
        System.out.println("CatName: " + name + " ||" + " пробежал: " + run +
                " метров" + " ||" + " проплыл: " + swim + " ||" + " прыгнул: " + jump + " метров");
    }
}

