package recursion;

public class SumEvens {

	public static void main(String[] args) {
		System.out.println(sum(10));
	}
	
	static int sum(int n) {
		if (n > 0) {
			n += sum(n-2);
		}
		return n;
	}

}
