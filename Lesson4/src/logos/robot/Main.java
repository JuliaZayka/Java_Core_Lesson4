package logos.robot;

public class Main {

	public static void main(String[] args) {

		Robot r1 = new Robot();
		// r1.work();
		CoffeRobot r2 = new CoffeRobot();
		// r2.work();
		RobotDancer r3 = new RobotDancer();
		// r3.work();
		RobotCoocker r4 = new RobotCoocker();
		// r4.work();

		Robot[] array = { r1, r2, r3, r4 };

		for (int i = 0; i <= 3; i++) {
			array[i].work();
		}
	}
}
