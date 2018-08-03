package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Random ran = new Random();
	int smallesty = 1000;
	int winner = 0;
	//2. create an array of 5 robots.
Robot[] r = new Robot[10];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < r.length; i++) {
	r[i] = new Robot();
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < r.length; i++) {
			r[i].miniaturize();
			r[i].setSpeed(15);
			r[i].setX(50 + (i*100));
			r[i].setY(500);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		
		
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		while(smallesty > 0) {
			for (int i = 0; i < r.length; i++) {
				r[i].move(ran.nextInt(50));
			}
			for (int i = 0; i < r.length; i++) {
				if(r[i].getY() < smallesty) {
					smallesty = r[i].getY();
					winner = i++;
				}
				
			}
		}
	//7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "The winner is robot number " + winner);
	//8. try different races with different amounts of robots.
		
	
}
}
