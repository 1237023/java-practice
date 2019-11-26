package com.rakovets.course.challenge.classes;

public class Zombie extends Enemy{

    double health;
    double ressurectionHealth;

    Zombie(double health) {
        super(health);
        ressurectionHealth = health/2;
    }

    public void ressurection() {
        this.health = ressurectionHealth;
        this.ressurectionHealth =this.ressurectionHealth/2;
        System.out.println("I have ressurected!!!!");
    }

}
