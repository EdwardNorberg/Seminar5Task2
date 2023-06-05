package se.EdwardNorberg.SeminarTask2;

import java.util.Random;

public class DiceComposition {
    
    Random random;

    public DiceComposition() {
        random = new Random();
    }

    public void rollDice() {
        System.out.println("Result: " + (random.nextInt(5) + 1));
    }

    public void rollDice(int numberOfDice) {
        for (int i = 1; i <= numberOfDice; i++) 
            System.out.println("Throw " + i + "> is: " + (random.nextInt(6) + 1));
        
    }
}
