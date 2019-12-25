package com.company;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public boolean reduce(int n){
        int diff = food - n;
        if(diff < 0) return false;
        food -= n;
        return true;
    }

    public void info() {
        System.out.println("В миске: " + food + " мясных кубиков Wiskas");
    }

    public void addFood(int food) {
        System.out.println("=====================================\nДобавляем еду: " + food + " мясных кубиков Wiskas");
        this.food += food;
    }
}
