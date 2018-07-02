package d4;

public class Prac02 {
	public Prac02() {
		Thread thread = new Prac02Thread() {
			public void run() {
				System.out.println("run3-");
			}
		};
		thread.start();
	}
	public static void main(String[] args) {
		new Prac02();
	}
}
