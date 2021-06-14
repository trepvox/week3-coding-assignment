import java.util.stream.IntStream;

public class lecture {

	public static void main(String[] args) {
//		1).
		int[] arrayOfAges;
		int[] ages = new int[8];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		int ageDiff = ages[ages.length - 1] - ages[0];
		System.out.println(ageDiff);
		
		for(int i = 0; i < ages.length; i++) {
			System.out.println("Current index is: " + i + ", which has a value of " + ages[i]);
		}
		
		
//		2).
		
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		int sum = 0;
		for (String name : names) {
			sum += name.length();
		} System.out.println(sum);
		
//		b.	Use a loop to iterate through the array again and concatenate all the names together,
//		       separated by spaces, and print the result to the console.
		
		String nameResults = "";
		for (String name : names) {
			nameResults += name + " ";
		} System.out.println(nameResults);
		
//		3.	How do you access the last element of any array?
		
		System.out.println(names[names.length - 1]);
		
//		4. How do you access the first element of any array?
		
		System.out.println(names[0]);
		
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously 
//		 created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int [names.length]; 
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		for (int length : nameLengths) {

		System.out.print(length + " ");
		}
		System.out.println();
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in 
//		the array. Print the result to the console.
		int sum1 = IntStream.of(nameLengths).sum();
		System.out.println(sum1);
		
			sum1 = 0;
			for(int i = 0; i < nameLengths.length; i++) {
				sum1 = nameLengths[i] + sum1; 

			} 
		System.out.println(sum1);
		
		
		System.out.println();
		
		System.out.println(multiplyString("Hello", 3));
		System.out.println(multiplyString("Dave", 5));
		
		

}
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word 
//		concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method 
//      to return “HelloHelloHello”).
	public static String multiplyString(String word, int n)	{
		String resultString = "";
		for(int i = 0; i < n; i++) {
			resultString += word;
		
		}  return resultString;
	}
	
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full 
//			name should be the first and the last name as a String separated by a space).
	public static String fullNames(String firstName, String lastName) {
		return ("firstName" + " " + "lastName");
	}
	
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the 
//			array is greater than 100.
	public static boolean greaterThanOneHundred(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		if (sum>100) {
			return true;
		} else {
			return false;
		}
	}
	
//		10.	Write a method that takes an array of double and returns the average of all the elements in the 
//			array.
	public static double avgOfDoubles(double[] dbls) {
		double sum = 0;
		for (double d : dbls) {
			sum += d;
		}
		double avgDbl = sum / dbls.length;
		return avgDbl;
	}
	
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements 
//			in the first array is greater than the average of the elements in the second array.
		public static boolean firstArrayGreater(double[] array1, double[] array2) {
			if (avgOfDoubles(array1) > avgOfDoubles(array2)) {
				return true;	
			} else {
				return false;
			}
		}
	
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
//			and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside && (moneyInPocket>10.50)) {
				return true;
			} else {
				return false;
			}
		}
	
//		13.	Create a method of your own that solves a problem. In comments, write what the method does and
//			why you created it.
		public static boolean isTooMuch(int numAssignmentProbs, boolean toMuch) {
			if (numAssignmentProbs > 2 || ((numAssignmentProbs > 0) && toMuch)) {
				System.out.println("I cry");
				return true;
			} else {
				System.out.println("I do okay");
				return false;
			}	
			//I just about lost it multiple times this week even with all the outside help because of just how
			//lost I was feeling and that nothing helped.
		
	
		}
}
	

	


