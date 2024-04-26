
package _01_else_if._1_robot_color_chooser;


import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		 Robot rob  = new Robot(); rob.setSpeed(1000);
		 for(int x=0;x<1000; x++){
			 rob.setPenWidth(10);
		 rob.penDown();

		 rob.move(100);
		 rob.turn(120);

		 rob.move(100);
		 rob.turn(120);

		 rob.move(100);
		 rob.turn(120);
		 
		rob.move(100);
		//3. Set the pen width to 10
		 rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		 JOptionPane.showMessageDialog(null,"what color would you like?");
		String red = JOptionPane.showInputDialog("type how much red u want");
		String blue= JOptionPane.showInputDialog("type how much blue u want");
		String green= JOptionPane.showInputDialog("type how much green u want");
		 int redAsInt = Integer.parseInt(red); int blueAsInt = Integer.parseInt(blue); int greenAsInt = Integer.parseInt(red);
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color 
		 rob.setPenColor(redAsInt,blueAsInt,greenAsInt);
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		 }
		



	}
}
