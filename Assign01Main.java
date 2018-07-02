package d4;

public class Assign01Main {
	int alphabet = 97;

	public Assign01Main() {
		Thread thread = new Assign01Worker();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					char tostring = (char) alphabet;
					alphabet++;
					System.out.println("Main: " + tostring);

					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		thread.start();
		while (!thread.isInterrupted()) {
			thread1.run();
		}


	}

	public static void main(String[] args) {
		new Assign01Main();
	}
}
