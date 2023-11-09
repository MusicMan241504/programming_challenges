package recursion;

public class Pi {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		double pi = leibniz(1);
		
		long endTime = System.nanoTime();
		long time = endTime-startTime;
		System.out.println(time/1000000.0 + " ms");
		
		System.out.println(pi);

		
		startTime = System.nanoTime();

		double pi2 = leibniz_iter();
		
		endTime = System.nanoTime();
		time = endTime-startTime;
		System.out.println(time/1000000.0 + " ms");
		
		System.out.println(pi2);
	}

	static double leibniz(int n) {
		if (n >= 5000) {
			return 0;
		} else {
			double pi = leibniz(n+1);
			return pi + 4.0/(4*n-3)-4.0/(4*n-1);
		}
	}
	
	static double leibniz_iter() {
		double total = 0;
		for (int n = 1; n < 100000; n++) {
			total += 4.0/(4*n-3)-4.0/(4*n-1);
		}
		return total;
	}

}
