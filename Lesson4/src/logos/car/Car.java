package logos.car;

public class Car {
	public double price;
	public Kermo kermo;
	public Koleso koleso;
	public Kysov kysov;
	
	public void aboutcar(double price, Kermo kermo, Koleso koleso, Kysov kysov){
		this.price=price;
		this.kermo=kermo;
		this.koleso=koleso;
		this.kysov=kysov;
	}
    
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Kermo getKermo() {
		return kermo;
	}


	public void setKermo(Kermo kermo) {
		this.kermo = kermo;
	}


	public Koleso getKoleso() {
		return koleso;
	}


	public void setKoleso(Koleso koleso) {
		this.koleso = koleso;
	}


	public Kysov getKysov() {
		return kysov;
	}


	public void setKysov(Kysov kysov) {
		this.kysov = kysov;
	}


	public void price(double price){
		this.price=price;
	}
	@Override
	public String toString() {
		return "price=" + price ;
	};
	
	
   

}
