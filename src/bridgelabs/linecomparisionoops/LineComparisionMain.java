package com.bridgelabz.linecomparisionoops;
import java.util.Scanner;
public class LineComparisionMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Line line1 = new Line();
		Line line2 = new Line();
		//LINE 1 COORDINATES
		System.out.println("Enter Line 1 Coordinates");
		int l1x1 = sc.nextInt();
		int l1y1 = sc.nextInt();
		line1.setStartCoordinates(l1x1, l1y1);
		int l1x2 = sc.nextInt();
		int l1y2 = sc.nextInt();
		line1.setEndCoordinates(l1x2, l1y2);
		
		//LINE 2 COORDINATES
		System.out.println("Enter Line 2 Coordinates");
		int l2x1 = sc.nextInt();
		int l2y1 = sc.nextInt();
		line2.setStartCoordinates(l2x1, l2y1);
		int l2x2 = sc.nextInt();
		int l2y2 = sc.nextInt();
		line2.setEndCoordinates(l2x2, l2y2);
		
		LengthComparisionIF lengthComparator = new LengthComparisionImpl();
		System.out.println("Comparing the two lines: ");
		lengthComparator.compareLength(line1, line2);

	}

}
