package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
public static void main(String[] args) {
	Random r  = new Random();
	Robot mini = new Robot();
	Robot[] five = new Robot[5];
	Random ran = new Random();
	Robot.setWindowSize(400, 800);
	for(int i = 0; i<5; i++) {
		five[i] = new Robot("mini");
		five[i].setY(750);
		five[i].setX(50+(i*75));
	}
while(true) {
	for(int i = 0; i<5; i++) {
		five[i].move(r.nextInt(100));
	}
}
}
        // 3. use a for loop to initialize the robots.
   
        // 4. make each robot start at the bottom of the screen, side by side, facing up
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
}
