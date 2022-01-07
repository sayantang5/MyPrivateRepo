package com.App;

import java.util.Arrays;

public class MaxdifferenceInArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] intArr= {1,2,5,6,89,56,78,756,889,899,2,56,89,23,999};
		Arrays.sort(intArr);

		 for(int i =0;i<intArr.length;i++) {
			 
			 System.out.println(intArr[i]+"  ");
		 }
		 
		 
		 System.out.println(intArr[0]+"   "+intArr[intArr.length-1]+"  difference is "+( intArr[intArr.length-1]-intArr[0]));
		
	}

}
