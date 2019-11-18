/*
Name: Sean Styer
Date: 5/1/19
Title: Plus.java
Description: An extension of Binop in which the operator is addition
*/
public class Plus extends Binop{
	int depth;
	public Plus () {
		depth = super.depth;
	}
	public Plus(Node l, Node r) {
		//save the two Nodes
		super(l, r);
		depth = super.depth + 1;
	}
	public double eval(double [] data) {
		//add the two nodes together
		return lChild.eval(data) + rChild.eval(data);
	}
	public String toString() {
		//return the addition problem computed by the eval method as as string
		return "(" + lChild.toString() + " + " + rChild.toString() + ")";
	}
}
