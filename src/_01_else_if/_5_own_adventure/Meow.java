package _01_else_if._5_own_adventure;

import java.util.Random;

import javax.swing.JOptionPane;

public class Meow {

	public static void main(String[] args) {


		int gold = 0;
		int health = 100;
		int damage = 1;
		String firstDecision = JOptionPane.showInputDialog("you are at  fork in the road, chose right or left.");

		if (firstDecision.contains ("right")&& !firstDecision.contains("left")	) {


			int choice1 = JOptionPane.showConfirmDialog(null, "do you want to continue");


			System.out.println(choice1);

			if (choice1 == 0) {

				String secondDecision = JOptionPane.showInputDialog("you have reached a town, you can go three derectons, right, left, foward.");

				if (secondDecision.contains ("right")&& !firstDecision.contains("left") && !secondDecision.contains("foward")	) {
					health =health-2;
					gold= gold + 10;


					JOptionPane.showMessageDialog(null,"you find 10 gold, but stub your toe. you have "+gold+" gold and "+health+" health" );
				}
				if (secondDecision.contains ("left")&& !firstDecision.contains("right") && !secondDecision.contains("foward")	) {
					
					
JOptionPane.showMessageDialog(null, "YOU DIE LOL why would you ever chose left");					
					
				System.exit(0);
					
				}	
				if (secondDecision.contains ("left")&& !firstDecision.contains("right") && !secondDecision.contains("foward")	) {
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
				
				
				
				
				
				
				

			}
		}


		else{
			JOptionPane.showMessageDialog(null,"you have died, to goblinis waiting on the left side of the road");
		}


	}

}
