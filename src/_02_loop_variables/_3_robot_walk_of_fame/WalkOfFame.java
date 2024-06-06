
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(1000000);
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
rob.setY(475);

		// 2. Make the robot draw a star shape. Hint: angle=144. 
rob.setAngle(90);
meow2(rob,2);
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	} static void meow(Robot rob,  int meow2, int size) {
		rob.penDown();
		rob.turn(144);
		rob.move(size);rob.turn(144);
		rob.move(size);rob.turn(144);
		rob.move(size);rob.turn(144);
		rob.move(size);rob.turn(144);
		rob.move(size);
		rob.turn(meow2);
		rob.penUp();
		rob.move(size);
}
	static void meow2 (Robot rob, int size)
{
		

		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 216,size );
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 216,size );
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 216,size );
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 216,size );
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
		meow(rob, 0,size);
}}