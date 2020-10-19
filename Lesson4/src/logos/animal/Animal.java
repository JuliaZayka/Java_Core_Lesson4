package logos.animal;

public class Animal {

	private String name;
	private int age;
	private double speed;
	
	
	public Animal(String name, int age, double speed) {
		super();
		this.name = name;
		this.age = age;
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Назва тварини=" + name + ", вік тварини=" + age + " років, швидкість тварини=" + speed + " км/год";
	}
	
}
