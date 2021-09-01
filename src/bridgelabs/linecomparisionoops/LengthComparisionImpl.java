package com.bridgelabz.linecomparisionoops;

public  class LengthComparisionImpl implements LengthComparisionIF {
	
LengthCalculatorIF lengthCalculatorObject = new LineComparisionImpl();
	
	public void compareLength(Line line1, Line line2) {
		Double lengthOfLine1 = lengthCalculatorObject.calculateLength(line1);
		System.out.println("Length of the First Line is: "+lengthOfLine1);
		Double lengthOfLine2 = lengthCalculatorObject.calculateLength(line2);
		System.out.println("Length of the Second Line is: "+lengthOfLine2);
		int compareValue = lengthOfLine1.compareTo(lengthOfLine2);
		if(compareValue < 0)
			System.out.println("Line 1 is smaller than Line 2");
		else if(compareValue == 0)
			System.out.println("Line 1 is equal to Line 2");
		else
			System.out.println("Line 1 is greater than Line 2");
	}
	public void checkIfEqual(Line line1, Line line2) {
		
		Double lengthOfLine1 = lengthCalculatorObject.calculateLength(line1);
		System.out.println("Length of the First Line is: "+lengthOfLine1);
		Double lengthOfLine2 = lengthCalculatorObject.calculateLength(line2);
		System.out.println("Length of the Second Line is: "+lengthOfLine2);
		if(lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("Line 1 and Line 2 are Equal");
		}
		else {
			System.out.println("Line 1 and Line 2 are not equal");
		}
	}
	

}
