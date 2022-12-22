
public class MultiDimensionArrays {

	public static void main(String[] args) {
		int[][] numbers = new int[2][];
		numbers[0] = new int[2];
		numbers[1] = new int[2];
		numbers[0][0] = 5;
		numbers[1][0] = 2;
		System.out.println(numbers[0][0]);
		System.out.println(numbers[1][0]);
	}

}
