package com.rakovets.course.challenge.classes;

public class Mag extends Hero{
    String name;
    final int DEFAULT_DAMAGE_FOR_MAG = 20;
    Mag(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("I attack enemy! BTW i am Mag and i hit you with fire");
        enemy.takeDamage(DEFAULT_DAMAGE_FOR_MAG);
    }
    public void superAttackEnemy(Enemy enemy) {
        System.out.println("I attack enemy! BTW i am Archer and i hit you with GIANT AMOUNT OF FIRE");
        enemy.takeDamage(DEFAULT_DAMAGE_FOR_MAG*2);
    }
}
