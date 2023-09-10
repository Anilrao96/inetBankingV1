package com.inetbanking.testCases;

public class CountOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "nnawwaaaeertt" ;
		char s = 'a';
		
		int count = 0;
		for(int i =0;i<inp.length();i++)
		{
			if(inp.charAt(i)==s)
				count++;
		}
				
		System.out.println(count);

	}

}
