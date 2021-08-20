package com.bridgelabz.linecomparision;
import java.lang.Math;
public class LineComparision {
	
	public static double getLength(int x1,int x2,int y1, int y2)
	{
		double result;
		result = Math.sqrt((x2-x1)^2+(y2-y1)^2);
		return result;
	}
	public static void main(String [] args) 
	{
		System.out.println("Welcome to line comparision computation program");
		System.out.println("the length of the lines is:" +getLength(10,12,7,8));
	}
	}


