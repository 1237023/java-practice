package com.rakovets.course.challenge.classes;

public class Archer extends Hero{
    String name;
    final int DEFAULT_DAMAGE_FOR_ARCHER = 15;
    Archer(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("I attack enemy! BTW i am Archer and i hit you with arrows");
        enemy.takeDamage(DEFAULT_DAMAGE_FOR_ARCHER);
    }
    public void superAttackEnemy(Enemy enemy) {
        System.out.println("I attack enemy! BTW i am Archer and i hit you with GIANT AMOUNT OF ARROWS");
        enemy.takeDamage(DEFAULT_DAMAGE_FOR_ARCHER*2);
    }
}
