package operations;

public class MyArray {
	private int[] numbers;
	
	public MyArray(int[] numbers) {
		this.numbers=numbers;
	}
	
	public int min() {
		int min=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<min)
				min=numbers[i];
		}
		return min;
	}
	
	public int max() {
		int max=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max)
				max=numbers[i];
		}
		return max;
		
	}
	
	public double avarage() {
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
		}
		return (double)sum/numbers.length;
	}
	
	public void printArray() {
		System.out.println("the array:");
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public int getSize() {
		return numbers.length;
	}

}
