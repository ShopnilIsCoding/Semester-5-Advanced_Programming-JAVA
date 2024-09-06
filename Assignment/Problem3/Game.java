package Problem3;

class Character {

    public void attack() {
        System.out.println("Character attacks with default damage.");
    }
}

class Warrior extends Character {

    @Override
    public void attack() {
        System.out.println("Warrior attacks with sword.");
    }
}

class Mage extends Character {

    @Override
    public void attack() {
        System.out.println("Mage casts a spell.");
    }
}

public class Game {
    public static void main(String[] args) {
        Character[] characters = { new Warrior(), new Mage(), new Character() };

        for (Character character : characters) {
            character.attack();  // Polymorphic call
        }
    }
}
