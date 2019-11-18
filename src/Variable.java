import java.util.Random;
/*
Name: Sean Styer
Date: 5/1/19
Title: Variable.java
Description: An extension of node that represents a variable in an equation
*/
public class Variable extends Node{
	int index;
	public Variable(int indexNum) {
		//store the parameter as the variable's index in a list of values
		index = indexNum;
	}
	//return the value of the inputed array that corresponds with the variable's index value
	public double eval(double [] data) {
		return data[index];
	}
	//return "X" followed by the index value
	public String toString() {
		return "X" + index;
	}
	
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {	
	}
}
