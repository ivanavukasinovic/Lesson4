package exercises;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	Robot robot = new Robot("mini");

	private void drawCicle(int radius) {
		for (int i = 0; i < 360; i++) {
			robot.move((int) ((2 * radius * Math.PI) / 360));
			robot.turn(1);
		}
	}

	private void drawSquare(int squareSide) {
		for (int i = 0; i < 4; i++) {
			robot.move(squareSide);
			robot.turn(360 / 4);
		}
	}

	private void drawTriangle(int triangleSide) {
		for (int i = 0; i < 3; i++) {
			robot.move(triangleSide);
			robot.turn(360 / 3);
		}
	}

	public static void main(String[] args) {
		int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);

		/*
		 * Create methods to draw a circle, square and triangle and call the appropriate
		 * one depending on the user choice.
		 */

		ObedientRobot or = new ObedientRobot();
		or.robot.setSpeed(10);
		or.robot.setPenWidth(3);
		or.robot.setRandomPenColor();
		or.robot.penDown();

		if (shape == 0) {
			String radiusAsString = JOptionPane.showInputDialog("Please enter the radius of the circle (minimum: 58):");
			int radius = Integer.parseInt(radiusAsString);
			or.drawCicle(radius);
		} else if (shape == 1) {
			String squareSideAsString = JOptionPane.showInputDialog("Please enter the side of the square:");
			int squareSide = Integer.parseInt(squareSideAsString);
			or.drawSquare(squareSide);
		} else {
			String triangleSideAsString = JOptionPane.showInputDialog("Please enter the side of the triangle:");
			int triangleSide = Integer.parseInt(triangleSideAsString);
			or.drawTriangle(triangleSide);
		}

	}

}
