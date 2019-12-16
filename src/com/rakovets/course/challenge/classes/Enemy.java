package com.rakovets.course.challenge.classes;

public class Enemy implements Mortal {
    double health;
   boolean alive;
    double ressurectionHealth;
    Enemy (double health) {
        this.health = health;
    }
    void setHealth(double health) {
        this.health = health;
    }
    double getHealth() {
        return this.health;
    }
    void takeDamage(int damage) {
        this.health = this.health - damage;
    }

    public boolean isAlive() {
        if (this.health > 0){
            alive = true;
        }else {
            alive = false;
        }

        return alive;
    }
}
