package com.company;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String phoneNumbers;
    private int pay;
    private int age;

    public Worker(String name, String position, String email, String phoneNumbers, int pay, int age) {
        this.name = name;
        this.position = position ;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.pay = pay;
        this.age = age;

    }
    public void print(){
        System.out.println("ФИО: " + this.name +" \n" + "Должность: " + this.position +" \n" + "Email: " + this.email +
                " \n" + "Номер телефона: " + this.phoneNumbers +" \n" + "Заработная плата: " + this.pay +" \n" + "Возраст: " + this.age);
        System.out.println();
    }


    public static void main(String[] args) {
        Worker[] personArray = new Worker[5];
        personArray[0] = new Worker("Петров Андрей Александрович ", "Генеральный директор", "vk@primer.ru", "+79996665544", 250000, 55);
        personArray[1] = new Worker("Зайцев Иван Владимирович ", "Технический директор", "vz@primer.ru", "+79998884455", 160000, 42);
        personArray[2] = new Worker("Медведев Дмитрий Степанович ", "Разработчик", "dm@primer.ru", "+79997771234", 25000, 21);
        personArray[3] = new Worker("Иванова Ольга Олеговна", "Ведущий разработчик", "ol@primer.ru", "+79995554789", 150000, 28);
        personArray[4] = new Worker("Волкова Кристина Алексеевна", "Продакт-менеджер", "kv@primer.ru", "+79994445896", 110000, 48);

        for (Worker worker : personArray) if (worker.age > 40) worker.print();

        Cat cat = new Cat("Барсик", 200.53, false, 1.54);
        cat.catInfo();
        Animals animals = new Animals();
        animals.animalInfo();
        Dog dog1 = new Dog("Шарик", 325.66, 10.87, 0.35);
        Dog dog2 = new Dog("Мухтар", 578.2, 5,1.34);
        dog1.dogInfo();
        dog2.dogInfo();




    }

}



