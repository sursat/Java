package Lambda;
/*
 * 2nd
 */
public class RunnableLambda {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i < 3 ; i++){
					System.out.println("Hello world from thread ["+Thread.currentThread().getName()+"]");
				}
			}
		};
		// using Lambda
		Runnable runnableLambda = () -> {
			for(int i=0; i < 3 ; i++){
				System.out.println("Hello world from thread ["+Thread.currentThread().getName()+"]");
			}
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();
		t1.join();
		
		Thread t2 = new Thread(runnableLambda);
		t2.start();
		t2.join();
	}
}
