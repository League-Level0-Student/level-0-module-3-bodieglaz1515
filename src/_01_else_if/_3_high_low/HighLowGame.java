
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		
		// 2. Print out the random variable above
	System.out.println(random);	
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String meow = JOptionPane.showInputDialog("your playing higher or lower, name the first number you think it might be  ");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int meowAsInt= Integer.parseInt(meow);
			// 5. if the guess is correct
			if (meowAsInt==random) {
				
				
			JOptionPane.showMessageDialog(null, "you win");
			System.exit(0);
			}
				// 6. Win
		for(int think = 0;think >10; think ++ ) {		// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			if(meowAsInt>random) {
				
				
				JOptionPane.showMessageDialog(null, "you guessed to high try again");
			}
				// 8. Tell them it's too high
			// 9. if the guess is lowif(meowAsInt>random) {
			
			if(meowAsInt<random) {
			JOptionPane.showMessageDialog(null, "you guessed to low try again");
		}
				// 10. Tell them it's too low
// 11. Repeat steps 1 to 10 ten times
		// 13. Tell them they lose
		
	}
	}
}


