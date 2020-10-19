package logos.car;

public class Koleso {

	private String season;
	
	public String getSeason() {
	return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	
	@Override
	public String toString() {
		return "Koleso [season=" + season + "]";
	}
	public void function2 (String season) {
		this.season=season;
	}
}
