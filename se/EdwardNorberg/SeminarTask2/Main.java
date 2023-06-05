package se.EdwardNorberg.SeminarTask2;

public class Main {
    public static void main (String[] args) {
            System.out.println("Dice using composition:");
            DiceComposition dc = new DiceComposition();
            dc.rollDice(3);

            System.out.println("\nDice using inheritance:");
            DiceInheritance di = new DiceInheritance(); 
            di.rollDice(3);
    }
}
