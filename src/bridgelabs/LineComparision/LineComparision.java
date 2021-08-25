package bridgelabs.LineComparision;

public class LineComparision {

	
		public static double getLength(double x1,double x2,double y1, double y2)
		{
			double result;		
			result = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
			return result;
		}
		public static class Line {
			double x1,x2,y1,y2;
			public Line(double i,double j,double k,double l) {
			
			x1=i;
			x2=j;
			y1=k;
			y2=l;
		}
		}
		
		
		public static void main(String [] args) 
		{
			
			Line l1 = new Line(0,4,9,3);
			Line l2 = new Line(-1,5,8,-6);
			Double length1, length2;
			length1 = getLength(l1.x1, l1.x2, l1.y1, l1.y2);
			length2 = getLength(l2.x1, l2.x2, l2.y1, l2.y2);
			
			int result = length1.compareTo(length2);
			if(result ==0)
				System.out.println("both values are equal");
			else if(result>0)
				System.out.println("1st line is greater than 2nd line");
			else 
				System.out.println("1st line is lesser than 2nd line");
		}
		

	
	}



