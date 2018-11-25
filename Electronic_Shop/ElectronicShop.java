package com.muntashir.me;

public class ElectronicShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] keyboards = {3,1};
		int[] drives = {5,2,8};
		int budget = 10;
		int finalOutput = getMoneySpent(keyboards, drives, budget);
		System.out.println(finalOutput);
	}
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
		
		int finalOutput=0;
		int total=0;
		int count = 0;
		int finaltotal=0;
		for(int i=0; i<keyboards.length; i++) {
			
				for (int j=0;j<drives.length;j++) {
					total = keyboards[i]+drives[j];
					if ((total>finaltotal) && (total<=b)) {
						finaltotal=total;
						count++;
					
				}
			}
		}
		if (count==0) {
			return -1;
		}else {
		return finaltotal;
		}
    }

}
