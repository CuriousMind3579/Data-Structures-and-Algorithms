package arrays;
import java.util.*;

public class SingleDimensionArray {
	
	int arr[];
	
	public SingleDimensionArray(int sizeofArrya){
		arr = new int[sizeofArrya];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	public void Insert(int location, int valueTobeInserted) {
		try {
			if(arr[location]== Integer.MIN_VALUE) {//-------------------------O(1)
			arr[location]=valueTobeInserted; //-------------------------------O(1)
			System.out.println("Value inserted successfully!!");//------------O(1)
			}
			else {
				System.out.println("The index is already occupied");//--------O(1)
			}
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Exception occured "+aiob);
		}
	}
	public void PrintArray() {
		System.out.println(Arrays.toString(arr));
	}
	
	//Array Traversal
	// No additional space is required for Array Traversal as we are not storing it
	
	public void traversArray() {
		try {
		for(int j=0;j<arr.length;j++) { //------------------------------------- O(N)
			System.out.println("Array element "+j+" ------"+arr[j]); //-------- O(1)
		}
		}
		catch(Exception e) {
			System.out.println("Exception occured "+e);//---------------------- O(1)
			
		}
	}
	
	//Searching an element in an Array
	
	public void searchElement(int valueToSearch) {
		for(int i =0; i<arr.length;i++) {//------------------------------------ O(N)
			if(arr[i]==valueToSearch) {//-------------------------------------- O(1)
				System.out.println("Value found in "+i);//--------------------- O(1)
				return;
			}
		}
		System.out.println("Value not found in Array");//---------------------- O(1)
	}

	public void deleteElement(int valueToDeleteIndex) {
		try {
			arr[valueToDeleteIndex]=Integer.MIN_VALUE;//----------------------- O(1)
			System.out.println("Array "+Arrays.toString(arr));//--------------- O(1)
		}catch(Exception e) {
			System.out.println("Exception e "+e);//---------------------------- O(1)
		}
	}
}
