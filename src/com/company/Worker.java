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

       Animals[] arrayOfAnimals = new Animals[4];
       arrayOfAnimals[0] = new Cat("Барсик", 15);
       arrayOfAnimals[1] = new Dog("Шарик", 0);
       arrayOfAnimals[2] = new Cat("Мурзик", 10);
       arrayOfAnimals[3] = new Cat("Пушок", 13);

       Plate plate = new Plate(15);

       for(Animals animals : arrayOfAnimals){
            animals.run(150);
            animals.jump(2.5);
            animals.swim(5);
            animals.eat(plate);
            animals.info();
        }
        plate.addFood(50);
        plate.info();
    }

}



