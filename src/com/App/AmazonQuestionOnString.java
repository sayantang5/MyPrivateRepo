package com.App;

public class AmazonQuestionOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Print this file ");
		
		int sum=0;
		
		String[] str= {"A2A","B2B","C3C","D4D"};
		
		for(int i=0; i<str.length;i++) {
			
			String str1=str[i];
			
			for(int j=0;j<str1.length();j++)
			{
				
				if(Character.isDigit(str1.charAt(j))) {
					
					sum=sum+Integer.parseInt(str1.charAt(j)+"");
				}
				
			}
			
			
			
		}
		
		
		System.out.println("Sum of digit is ::"+sum);

	}

}
