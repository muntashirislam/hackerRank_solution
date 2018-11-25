package com.example.readinglist;

public class CountingVally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "UDDDUDUU";
		int steps = 8;
		

	}
	static int countingValleys(int n, String s) {

		int valley = 0;
		int[] position =new int [n];
		int stepcount = 0;
		for (int i=0;i<n; i++) {
			if (s.charAt(i)=='U') {
				stepcount++;
			}else {
				stepcount--;
			}
			position[i]=stepcount;
		}
		for(int i=1; i<n; i++) {
			if((position[i-1]==-1) && position[i]==0) {
				valley++;
			}
		}
		
			return valley;
    }
}
