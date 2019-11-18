/*
Name: Sean Styer
Date: 5/1/19
Title: DataRow.java
Description: Stores data points
*/
public class DataRow {
	private double y;
	private double [] variables;
	
	public DataRow(double yVal, double[] xVals) {
		y = yVal;
		variables = new double[xVals.length];
		for(int i = 0; i < xVals.length; i++) {
			variables[i] = xVals[i];
		}
	}
	
	public double getY() {
		return y;
	}
	
	public double getVar(int varNum) {
		return variables[varNum];
	}
	
	public double [] getVarList() {
		return variables;
	}
}