package recursion;

public class Triangle {

	public static void main(String[] args) {
		int num = fib(4);
		System.out.print(num);
	}
	
	static int fib(int num) {
		if (num == 1) {
			return num;
		}else {
			num += fib(num-1);
			return num;
		}
		
	}

}
