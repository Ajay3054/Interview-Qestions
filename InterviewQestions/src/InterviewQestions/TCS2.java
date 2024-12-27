package InterviewQestions;

import java.util.Arrays;

//Merge Two Arrays
public class TCS2 {

	public static void mergeTwoArrays(int [] arr1 , int [] arr2) {
		
		int [] mergedArray = new int[arr1.length + arr2.length];
		
		System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
		System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
		
		System.out.println(Arrays.toString(mergedArray));
	}
	
	public static void main(String[] args) {
		int [] list1 = {5,6,5,8,7,9,4};

		int[] list2 = {16,55,68,57,9,4};
		
		mergeTwoArrays(list1, list2);
		
	}
}
