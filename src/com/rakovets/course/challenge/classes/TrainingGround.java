package com.rakovets.course.challenge.classes;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy zombie = new Enemy(50);
        Warrior fred = new Warrior("Fred");
        Archer jack = new Archer("Jack");
        Mag duke = new Mag("Duke");
        fred.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        System.out.println(zombie.isAlive());
        duke.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        System.out.println(zombie.isAlive());
        jack.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        System.out.println(zombie.isAlive());
        Enemy zombie1 = new Zombie(50);
        Enemy zombie2 = new Zombie(50);
        Enemy zombie3 = new Zombie(50);
        duke.superAttackEnemy(zombie1);
        System.out.println(zombie1.getHealth());
        System.out.println(zombie1.isAlive());
        jack.superAttackEnemy(zombie1);
        System.out.println(zombie1.getHealth());
        System.out.println(zombie1.isAlive());
        ((Zombie) zombie1).ressurection();
        System.out.println(zombie1.getHealth());
        fred.superAttackEnemy(zombie1);
        System.out.println(zombie1.getHealth());
        System.out.println(zombie1.isAlive());
    }
}
