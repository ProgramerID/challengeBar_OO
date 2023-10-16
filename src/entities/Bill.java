package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecure;
	public int softDrink;

	
	public double feeding() {
		return (5 * beer) + (3 * softDrink) + (7 * barbecure);

	}

	public double cover() { 
		if (this.feeding() > 30.00) {
			return 0.00;
		} else {
			return 4.00;
		}
	}

	
	public double ticket() {
		if (gender == 'M') {
			return 10.00;
		}else {
			return 8.00;
		}
	}

	public double total() {
		return feeding() + cover() + ticket();

	}

}
