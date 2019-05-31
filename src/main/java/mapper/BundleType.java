package mapper;

public class BundleType {
	private String bundle;
	private int point;
	private int cash;
	
	public String getBundle() {
		return bundle;
	}

	public void setBundle(String bundle) {
		this.bundle = bundle;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	
	
	public BundleType(String bundle, int point, int cash) {
		this.bundle = bundle;
		this.point = point;
		this.cash = cash;
	}
	
}
