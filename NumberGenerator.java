package com.number_game;
import java.util.Random;

public class NumberGenerator {
   int min;
   int max;
   Random random;
   
   
   public NumberGenerator(int min,int max) {
	   this.min = min;
	   this.max = max;
	   random = new Random();
   }
   
   public int generateNumber() {
	    int number = random.nextInt(max - min + 1) + min;
	    return number;
   }
}
