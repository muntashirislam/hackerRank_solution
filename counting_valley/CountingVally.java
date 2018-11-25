package com.example.readinglist;

public class CountingVally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "UDDDUDUU";
		int steps = 8;
		int counting = countingValleys(steps, s);
		System.out.println(counting);
	}
	static int countingValleys(int n, String s) {

		int val = 0;
		int[] pos =new int [n];
		int step = 0;
		for (int i=0;i<n; i++) {
			if (s.charAt(i)=='U') {
				step++;
			}else {
				step--;
			}
			pos[i]=step;
		}
		for(int i=1; i<n; i++) {
			if((pos[i-1]==-1) && pos[i]==0) {
				val++;
			}
		}
		
			return val;
    }
}
