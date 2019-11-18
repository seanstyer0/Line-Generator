import java.util.Random;

/*
Name: Sean Styer
Date: 5/1/19
Title: Const.java
Description: An extension of node that saves a single double value
*/
public class Const extends Node{
	private double value;
	public Const(double d){
		value = d;
	}
	public double eval(double [] data) {
		//return the stored value as a double
		return value;
	}
	public String toString() {
		//return the stored value as a string
		return value + "";
	}
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {	
	}
}
