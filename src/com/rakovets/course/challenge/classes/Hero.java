package com.rakovets.course.challenge.classes;

public abstract class Hero {
        String name;
        final int DEFAULT_DAMAGE_FOR_HERO = 15;
        Hero(String name){
            this.name = name;
        }

        public String getName(){
        System.out.println("name: " + name);
        return name;
        }

        public abstract void attackEnemy(Enemy enemy);
    }
