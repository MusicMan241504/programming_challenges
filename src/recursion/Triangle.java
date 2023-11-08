package recursion;

public class Triangle {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		
		long num = tri(100);
		
		long endTime = System.nanoTime();
		long time = endTime-startTime;
		System.out.println(time/1000000.0 + " ms");
		
		startTime = System.nanoTime();
		
		long num2 = tri_iter(100);
		
		
		endTime = System.nanoTime();
		time = endTime-startTime;
		System.out.println(time/1000000.0 + " ms");

		System.out.println(num);
		
		System.out.println(num2);
		

	}
	
	static long tri(long num) {
		if (num <= 1) {
			return num;
		}else {
			num += tri(num-1);
			return num;
		}
		
	}
	
	static long tri_iter(long num) {
		long total = 0;
		for (int i = 1; i<=num; i++) {
			total += i;
		}
		return total;
	}

}
