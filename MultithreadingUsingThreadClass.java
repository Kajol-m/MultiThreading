package multithreading;

class MyThread extends Thread{
	@Override
	public void run() {
		int j=0;
		while(j<90) {
		 System.out.println("I am happy");
		 System.out.println("Hello");
		 j++;
	}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<80) {
			System.out.println("Thread 2 is good");
			System.out.println("Hola");
			i++;
		}
	}
}
public class MultithreadingUsingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		MyThread2 t2=new MyThread2();
		t1.start();
		t2.start();

	}

}
