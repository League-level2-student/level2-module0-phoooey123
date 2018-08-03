package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		int smallestNum = 100;
		int largestNum = 0;
		//1. make an array of 5 Strings
		String[] list = {"a","b","c","d","e"};
		//2. print the third element in the array
		System.out.println(list[2]);
		//3. set the third element to a different value
		list[2] = "f";
		//4. print the third element again
		System.out.println(list[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		//6. make an array of 50 integers
		int[] int50 = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < int50.length; i++) {
			int50[i] = r.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		for (int i = 0; i < int50.length; i++) {
			if(int50[i] < smallestNum) {
				smallestNum = int50[i];
			}
		}
		System.out.println(smallestNum);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < int50.length; i++) {
			System.out.println(int50[i]);
		}
		//10. print the largest number in the array.
		for (int i = 0; i < int50.length; i++) {
			if(int50[i] > largestNum) {
				largestNum = int50[i];
			}
		}
		System.out.println(largestNum);
	}
}
