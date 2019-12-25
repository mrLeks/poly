package com.company;

public class Animals {
    protected String name;

    protected int runLimit = 0;
    protected double jumpLimit = 0;
    protected int swimLimit = 0;

    protected int appetite;
    protected boolean hungry;

    public Animals() { this.name = "Безымянный"; }

    public Animals(String name) {
        this.name = name;
    }

    public void run(int distance){
        if(runLimit > 0 && distance <= runLimit){
            System.out.println(this.name + " пробежал " + distance + " метров");

        }
        else {
            System.out.println(this.name + " не сможет пробежать столько!");
        }
    }

    public void swim(int distance){
        if(swimLimit > 0 && distance <= swimLimit){
            System.out.println(this.name + " проплыл " + distance + " метров");

        }
        else {
            System.out.println(this.name + " не сможет проплыть столько!");
        }
    }

    public void jump(double height){
        if(jumpLimit > 0 && height <= jumpLimit){
            System.out.println(this.name + " пробежал " + height + " метров");
        }
        else {
            System.out.println(this.name + " не сможет пробежать столько!");
        }
    }

   public void info() {
        String isHungry = !hungry ? "после тренировки плотно покушал и доволен" : "после тренировки проголодался, но в тарелке нет еды!";
        System.out.println(name + ": " + isHungry);
    }

   public void eat(Plate plate) {
        if (hungry && plate.reduce(appetite))
            hungry = false;
    }
  
}




