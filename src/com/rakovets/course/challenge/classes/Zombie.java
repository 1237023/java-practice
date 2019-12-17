package com.rakovets.course.challenge.classes;

public class Zombie extends Enemy {

    double health;
    double ressurectionHealth;

    Zombie(double health) {
        super(health);
        this.health = health;
        this.ressurectionHealth = health/2;
    }

    public double getRessurectionHealth() {
        return this.ressurectionHealth;
    }

    public void ressurection() {
        this.health = getRessurectionHealth();
        this.ressurectionHealth = getRessurectionHealth() / 2;
        System.out.println("I have ressurected!!!!");
    }

}
