package arrays;


import java.util.Arrays;

/**
 *
 * args[1]
 * args[3], args[4]
 * args[2], args[5], args[6]
 *
 * Необходимо реализовать toString для двумерного массива
 *
 * */
public class MyTriangleArray {
	public static void main(String[] args) {
		
		System.out.println(doubleDemisionToString(args));
		
	}
	
	private static String[] convertToArray(String[] args)[]{
		
		String triangleArray[][] = new String[][]{{args[1]}, {args[3], args[4]},  {args[2], args[5], args[6]}};
		return triangleArray;
		
	}
	
	private static String doubleDemisionToString(String[] args){
		String resultString = "";
		Arrays.sort(args);
		String[][] arrStr = convertToArray(args);
		for (String[] anArrStr : arrStr) {
			resultString += Arrays.toString(anArrStr);
		}
		return resultString;
		
	}
}
