package multithreading;


class MyThread1 implements Runnable{
	public void run() {
		int i=0;
		while(i<20) {
		System.out.println("I am thread1");
		i++;
	}
	}
}

class MyThread_2 implements Runnable{
	public void run() {
		int j=0;
		while(j<30) {
		System.out.println("I am thread2");
		j++;
	}
	}
}

public class MultithreadingUsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1=new MyThread1();
		Thread a=new Thread(t1);
		MyThread_2 t2=new MyThread_2();
		Thread b=new Thread(t2);
		a.start();
		b.start();
		

	}

}
