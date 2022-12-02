//package j20_함수형인터페이스;
//
//public class Main1 {
//	
//	public static void main(String[] args) {
//		int a= 10;
//		
//		Runnable appication1= () -> {
//			System.out.println("프로그램을 시작힙니다.");
//			System.out.println("a : " + a);
//		};
//		
//		appication1.run();
//		
//		Thread t1 = new  Thread(() -> {
//			for(int i =0; i <100;i++) {
//				
//					try {
//						System.out.println("알림기능");
//						System.out.println(i + "");
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			 
//		}
////	};);
//		Thread t2 = new  Thread(time);
//
//		//비동기 처리
//		t1.start();
//		t2.start();
//	}
//
//}
