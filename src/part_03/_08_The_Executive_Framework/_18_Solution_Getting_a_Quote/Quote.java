package part_03._08_The_Executive_Framework._18_Solution_Getting_a_Quote;

public class Quote {

	private final String site;

	private final int price;

	public Quote(String site, int price) {
		this.site = site;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getSite() {
		return site;
	}

	@Override
	public String toString() {
		return "Quote{" + "site='" + site + '\'' + ", price=" + price + '}';
	}

}
