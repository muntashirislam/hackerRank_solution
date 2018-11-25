package com.example.readinglist;

import java.util.ArrayList;

public class PairOfSock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,20,20,10,10,30,50,10,20};
		int n = 9;
		int matchCount = sockMerchant(n, ar);
		
        System.out.println(matchCount);
	}
	static int sockMerchant(int n, int[] ar) {
		int matchCount = 0;
        int selectedColor = 0;
        int length = ar.length;

        ArrayList<Integer> colorArr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
        	selectedColor = ar[i];
            if (colorArr.contains(selectedColor)) {
                matchCount++;
                colorArr.remove(new Integer(selectedColor));
            } else {
            	colorArr.add(new Integer(selectedColor));
            }
        }
        return matchCount;
	}
}
