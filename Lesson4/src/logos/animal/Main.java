package logos.animal;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal ("Pantera", 7, 14.7);
        System.out.println(animal);
        animal.setName("Leopard");
        animal.setAge(6);
        animal.setSpeed(18.9);
        System.out.println(animal);
	}

}
