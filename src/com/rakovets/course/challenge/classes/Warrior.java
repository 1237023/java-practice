package com.rakovets.course.challenge.classes;

public class Warrior extends Hero{
    String name;
    final int DEFAULT_DAMAGE_FOR_WARRIOR = 25;
    Warrior(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("I attack enemy! BTW i am Warrior and i hit you with sword");
        enemy.takeDamage(DEFAULT_DAMAGE_FOR_WARRIOR);
    }
    public void superAttackEnemy(Enemy enemy) {
        System.out.println("I attack enemy! BTW i am Archer and i hit you with GIANT AMOUNT OF SWORDS");
        enemy.takeDamage(DEFAULT_DAMAGE_FOR_WARRIOR*2);
    }
}
