package d4;


public class Assign01Worker extends Thread {

	public void run() {
		int time = 0;
		for (int i = 0; i < 10; i++) {
			try {
				if(time<=4000) {
					System.out.println("Worker: "+i);

					time += 1000;
					Thread.sleep(1000);
				}
				else {
					Thread.currentThread().interrupt();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
