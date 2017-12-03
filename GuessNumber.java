# Guess-a-number-
Simple program for begginers! 

import java.util.Scanner;
public class GuessNumber {

	static int randomNumber = 1;
	static int guessNumber = 0; 
	static Scanner i = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		while(getResult(guessNumber) != -1){
			System.out.println("Guess a number between 1 and 10! ");
		guessNumber = i.nextInt(); 
		}
		System.out.println("Yes! You are right!");
	 
		
	}
     public static int getRandomNumber(){
    	 return randomNumber = (int) (Math.random()*11);
    	 
    	 
    	 
     }
     public static int getResult(int guessNumber){
    	 return guessNumber == randomNumber? -1 : guessNumber; 
    	 
    	 
    	 
     }
  
}
