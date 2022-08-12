package com.great.assignment.dsa.main;

public class Searching {
	public int countCompaniesInProfit(boolean array[]) {
		int count =0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==true)
				count++;
		}
		return count;
	}
}


