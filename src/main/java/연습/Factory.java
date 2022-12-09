package 연습;

public class Factory {
	private static Factory instance = new Factory();
	private String factorName;
	private Factory() {
	}
	public static Factory getInstance () {
		return instance;
	}

}
