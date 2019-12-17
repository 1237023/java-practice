package com.rakovets.course.challenge.classes;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy zombie = new Enemy(50);
        Warrior fred = new Warrior("Fred");
        Archer jack = new Archer("Jack");
        Mag duke = new Mag("Duke");
        fred.attackEnemy(zombie);
        System.out.println("getting zombies health: " + zombie.getHealth());
        System.out.println("checking whether zombie is alive: " + zombie.isAlive());
        duke.attackEnemy(zombie);
        System.out.println("getting zombies health: " + zombie.getHealth());
        System.out.println("checking whether zombie is alive: " + zombie.isAlive());
        jack.attackEnemy(zombie);
        System.out.println("getting zombies health: " + zombie.getHealth());
        System.out.println("checking whether zombie is alive: " + zombie.isAlive());
        Zombie zombie1 = new Zombie(50);
        Zombie zombie2 = new Zombie(50);
        Zombie zombie3 = new Zombie(50);
        duke.superAttackEnemy(zombie1);
        System.out.println("getting zombie1 health: " + zombie1.getHealth());
        System.out.println("checking whether zombie1 is alive: " + zombie1.isAlive());
        jack.superAttackEnemy(zombie1);
        System.out.println("getting zombie1 health: " + zombie1.getHealth());
        System.out.println("checking whether zombie1 is alive: " + zombie1.isAlive());
        System.out.println(((Zombie)zombie1).getRessurectionHealth());
        zombie1.ressurection();
        /*
        метд ressurecton меняет health zombie, в то время как герои снимают health enemy
         */
        System.out.println("getting zombie1 health: " + zombie1.getHealth());
        fred.superAttackEnemy(zombie1);
        System.out.println("getting zombie1 health: " + zombie1.getHealth());
        System.out.println("checking whether zombie1 is alive: " + zombie1.isAlive());
    }
}
