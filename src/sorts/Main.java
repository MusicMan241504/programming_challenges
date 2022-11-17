package sorts;


public class Main {

	public static void main(String[] args) {
		double[] list = randArray(50000,0,100000);
		double[] sortedList = insertionSort(list);
		for(double item : sortedList) {
			System.out.println(item);
		}

	}
	
	public static double[] bubbleSort(double[] list) {
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
	
	public static double[] insertionSort(double[] list) {
		for (int i = 1; i < list.length; i++) {
			double tmp = list[i];
			int i2 = i-1;
			while (i2 >= 0 && tmp < list[i2]) {
				list[i2+1] = list[i2];
				i2 = i2 - 1;
			}
			list[i2+1] = tmp;
			
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
