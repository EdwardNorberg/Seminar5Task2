package se.EdwardNorberg.SeminarTask2;

import java.util.Random;

public class DiceInheritance extends Random {
    
    public DiceInheritance() {}

    public void rollDice() {
        System.out.println("Result: " + (super.nextInt(6) + 1));
    }

    public void rollDice(int numberOfDice) {
        for (int i = 1; i <= numberOfDice; i++) 
            System.out.println("Throw " + i + "> is: " + (super.nextInt(6) + 1));
    }
}
