package sorts;


public class Main {

	public static void main(String[] args) {
		double[] list = randArray(1000000,0,1000000);
		double[] sortedList = bubblesort(list);
		for(double item : sortedList) {
			System.out.println(item);
		}

	}
	
	public static double[] bubblesort(double[] list) {
		boolean swaps = true;
		while(swaps) {
			swaps = false;
			for (int i = 0; i < list.length-1; i++) {
				if (list[i] > list[i+1]) {
					double tmp = list[i];
					list[i] = list[i+1];
					list[i+1] = tmp;
					swaps = true;
				}
			}
		}
		return list;
	}
	
	public static double[] randArray(int len, int min, int max) {
		double[] list = new double[len];
		for(int i = 0; i < len; i++) {
			list[i] = Math.random()*(max-min)+min;
		}
		return list;
	}

}
