package recursion;

public class Triangle {

	public static void main(String[] args) {
		int num = tri(4);
		System.out.print(num);
	}
	
	static int tri(int num) {
		if (num == 1) {
			return num;
		}else {
			num += tri(num-1);
			return num;
		}
		
	}

}
