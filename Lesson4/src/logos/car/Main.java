package logos.car;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();	
		Koleso koleso = new Koleso();
		Kysov kysov = new Kysov();
		Kermo kermo = new Kermo();
		
	    koleso.setSeason("winter");
	    System.out.println(koleso);
		kysov.setNomer (15668);
		System.out.println(kysov);
		kermo.setDiametr (50);
		System.out.println(kermo);
		car.setPrice(152003.80);
		System.out.println(car);
      
       
	

	}

}
