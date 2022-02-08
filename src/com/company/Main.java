package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Cow caw1 = new Cow("Madonna", 4, 100);
        Cow caw2 = new Cow("Maki", 3, 450);
        Cow caw3 = new Cow("Murka", 5, 500);
        Cow caw4 = new Cow("Vika", 7, 300);
        Cow caw5 = new Cow("Simka", 8, 400);

        Cow[] caw = {caw1, caw2, caw3, caw4, caw5};

        Sheep sheep1 = new Sheep("Alakuiruk", 4, 90);
        Sheep sheep2 = new Sheep("Make", 3, 45);
        Sheep sheep3 = new Sheep("Misha", 5, 57);
        Sheep sheep4 = new Sheep("Vaitka", 1, 66);
        Sheep sheep5 = new Sheep("Vashinkton", 9, 88);
        Sheep sheep6 = new Sheep("Slash", 7, 88);
        Sheep sheep7 = new Sheep("sheri", 2, 98);
        Sheep sheep8 = new Sheep("alankoz", 6, 55);

        Sheep[] sheep = {sheep1, sheep2, sheep3, sheep4, sheep5, sheep6, sheep7, sheep8};


        Horse horse1 = new Horse("karakashka", 5, 300);
        Horse horse2 = new Horse("karaker", 4, 350);

        Horse[] horse = {horse1, horse2};

        Jailoo jailoo = new Jailoo("Kara-Shoro", "J-Abad", "Sheraly", caw, sheep, horse);
        System.out.println("farm name : " + jailoo.getName() + ", address : " + jailoo.getAddress() + " owner : " + jailoo.getOwner()+
                "\n"+"cow :  "+caw.length+",  sheep : "+sheep.length+", horses : "+horse.length);


        System.out.println("\n" + "Cows :");
        for (Cow ui : caw) {
            System.out.println("name:  "+ui.getName() + ",  age: " + ui.getAge() + ",  whight: " + ui.getWeight());

        }
        System.out.println("-----------------------------------------");


        System.out.println("\n" + "sheeps :");
        for (Sheep koi : sheep) {

            System.out.println("name:  "+koi.getName() + ",  age: " + koi.getAge() + ",  age: " + koi.getWeight());
        }
        System.out.println("-----------------------------------------");

        System.out.println("\n" + "horses :");
        for (Horse at : horse) {

            System.out.println("name:  "+at.getName() + ", age: " + at.getAge() + ", weight: " + at.getWeight());
        }


    }
}