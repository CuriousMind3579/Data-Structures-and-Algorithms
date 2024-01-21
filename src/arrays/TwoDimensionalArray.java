package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {

	// IF THE DECLARATION AND INSTANTION IS COMBINED IN ONE LINE 
	//THEN THE TIME COMPLEXITY WILL BE O(1)INSTEAD OF O(2)
	
	//SPACE COMPLEXITY WILL BE O(MN)
	
	public void create2DArray() {
		//Declare
		int[][] _2DDArray;//--------------------------------------------------- O(1)
		//Instantiate
		_2DDArray = new int[2][2];//------------------------------------------- O(1)
		//Intialize
		_2DDArray[0][0] =1;//-------------------------------------------------- O(1)|
		_2DDArray[0][1] =2;//-------------------------------------------------- O(1)|---- O(MN)
		_2DDArray[1][0] =3;//-------------------------------------------------- O(1)|
		_2DDArray[1][1] =4;//-------------------------------------------------- O(1)|
		
		//view
		System.out.println("2D Array "+Arrays.toString(_2DDArray));//---------- O(1)
		System.out.println("2D Array "+Arrays.deepToString(_2DDArray));//------	O(1)
	}
}
