/*
Name: Sean Styer
Date: 5/1/19
Title: DataSet.java
Description: Stores DataRow objects
*/
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class DataSet {
	ArrayList<DataRow> data;
	FileReader input;
	private int numVars;
	private int numRows;
	
	//create an empty data set
	public DataSet() {
		data = new ArrayList<DataRow>();
	}
	
	public DataSet(String name) throws IOException {
		data = new ArrayList<DataRow>();
		input = new FileReader(name);
		Scanner readFile = new Scanner(input);
		numVars = readFile.nextInt();
		numRows = readFile.nextInt();
		
		for(int i = 0; i < numRows; i++){
			double yVal = readFile.nextDouble();
			double [] xVals = new double [numVars];
			for(int j = 0; j < xVals.length; j++) {
				xVals[j] = readFile.nextDouble();
			}
			
			data.add(new DataRow(yVal, xVals));
		}
		
		readFile.close();
	}
	
	public void addRow(DataRow newRow) {
		data.add(newRow);
	}
	
	public DataRow getRow(int index) {
		return data.get(index);
	}
	
	public int getNumRows() {
		return numRows;
	}
	
	public int getNumVars() {
		return numVars;
	}
}
