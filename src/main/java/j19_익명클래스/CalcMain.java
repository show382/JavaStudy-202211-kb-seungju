package j19_익명클래스;


public class CalcMain {

	public static void main(String[] args) {
		
		Calculator c = new Calculator() {
			@Override
			public int calc(int a, int b) {
				return a + b;
			}
		};

		Calculator c1 = ( x,  y) ->  x * y;
		Calculator c2 = ( x,  y) ->  x / y;
		System.out.println(c1.c2(4, 5));
		int r2 = c2.calc(10, 5);
		System.out.println(r2);
		int r1 = c1.calc(10, 20);
		System.out.println(r1);

//		Addition c2 = (x, y) -> x + y;
		Calculator c4 = new Addition();

//		int r2 = c2.calc(20, 30);
//		System.out.println(r2);

		Calculator c3 = new Calculator() {

			@Override
			public int calc(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
