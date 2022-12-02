package j19_익명클래스;

public interface Calculator {
	
	public int calc(int a, int b);
	
	public default int c2 (int a , int b) {
		return a + b;
	}
}
