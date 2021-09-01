package com.bridgelabz.linecomparisionoops;

public class Line {

	Points startCoordinates = new Points();
	Points endCoordinates = new Points();
	
	public Points getEndCoordinates() {
		return endCoordinates;
	}
	public Points getStartCoordinates() {
		return startCoordinates;
	}
	
	public void setStartCoordinates(int x1, int y1) {
		startCoordinates.setXCoordinate(x1);
		endCoordinates.setYCoordinate(y1);
	}
	
	public void setEndCoordinates(int x2, int y2) {
		startCoordinates.setXCoordinate(x2);
		endCoordinates.setYCoordinate(y2);
	}
	
	}


