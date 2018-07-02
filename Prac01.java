package d4;

public class Prac01 implements Runnable{
	public Prac01() {
		Thread thread = new Thread();
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
}
