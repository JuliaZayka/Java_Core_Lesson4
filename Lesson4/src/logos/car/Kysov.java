package logos.car;

public class Kysov {

    private int nomer;
	
	public int getNomer() {
	return nomer;
	}
	public void setNomer(int nomer) {
		this.nomer = nomer;
	}
	
	@Override
	public String toString() {
		return "Kysov [nomer=" + nomer + "]";
	}
	public void function3 (int nomer) {
		this.nomer=nomer;
	}
}


