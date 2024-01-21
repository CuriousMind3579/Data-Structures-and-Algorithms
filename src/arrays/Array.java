package arrays;

import java.util.Arrays;

public class Array {
	
	public static void main(String args[]) {
		
		TwoDimensionalArray tda = new TwoDimensionalArray();
		tda.create2DArray();
		
//		Array a = new Array();//----------------------------->O(1)
//		//a.createArray(5);
//		SingleDimensionArray sda = new SingleDimensionArray(5);
//		sda.Insert(0,1);
//		sda.Insert(1,2);
//		sda.Insert(2,3);
//		sda.Insert(3,4);
//		sda.Insert(4,5);
//		//sda.Insert(5,6);
//		//sda.traversArray();
//		//sda.PrintArray();
//		//sda.searchElement(4);
//		sda.deleteElement(2);
		
	}
	private void createArray(int n) {
		
		int arr[] = new int[n];//----------------------------->O(1)
		arr[0]=1;//------------------------------------------->O(1) 
		arr[1]=2;//------------------------------------------->O(1)
		arr[2]=3;//------------------------------------------->O(1)
		arr[3]=4;//------------------------------------------->O(1)
		arr[4]=5;//------------------------------------------->O(1)
		// If we intialise the elements in an array the time complexity would be O(N) in the above case
		System.out.println(Arrays.toString(arr));
		
		// Initializing all the elements together reduces the time complexity from O(N) to O(1)
		
		int arr2[] = {10,20,30,40,50};//------------------------------------------->O(1)
		System.out.println(Arrays.toString(arr2));
		}
}
