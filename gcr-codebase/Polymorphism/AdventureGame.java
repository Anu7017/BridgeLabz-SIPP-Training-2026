package ScenarioBasedOOPs.Polymorphism;

class GameCharacter {
    String characterName;

    GameCharacter(String n) {
        characterName = n;
    }

    void performAttack() {
    }
}

class Warrior extends GameCharacter {
    Warrior(String n) {
        super(n);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with sword");
    }
}

class Mage extends GameCharacter {
    Mage(String n) {
        super(n);
    }

    void performAttack() {
        System.out.println(characterName + " casts spell");
    }
}

class Archer extends GameCharacter {
    Archer(String n) {
        super(n);
    }

    void performAttack() {
        System.out.println(characterName + " shoots arrow");
    }
}

public class AdventureGame {
    static void startBattle(GameCharacter[] chars) {
        int w = 0, m = 0, a = 0;
        for (GameCharacter c : chars) {
            c.performAttack();
            if (c instanceof Warrior)
                w++;
            else if (c instanceof Mage)
                m++;
            else if (c instanceof Archer)
                a++;
        }
        System.out.println("Warriors=" + w);
        System.out.println("Mages=" + m);
        System.out.println("Archers=" + a);
    }

    public static void main(String[] args) {
        GameCharacter[] chars = { new Warrior("Thor"), new Mage("Merlin"), new Archer("Robin"), new Warrior("Leon") };
        startBattle(chars);
    }
}
